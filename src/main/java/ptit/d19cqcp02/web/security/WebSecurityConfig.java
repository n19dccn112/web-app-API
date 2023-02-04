package ptit.d19cqcp02.web.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import ptit.d19cqcp02.web.security.jwt.JwtAuthEntryPoint;
import ptit.d19cqcp02.web.security.jwt.JwtAuthTokenFilter;
import ptit.d19cqcp02.web.security.jwt.JwtUtils;
import ptit.d19cqcp02.web.security.services.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsServiceImpl userDetailsService;

    private final JwtAuthEntryPoint unauthorizedHandler;

    private final JwtUtils jwtUtils;

    public WebSecurityConfig(
            UserDetailsServiceImpl userDetailsService,
            JwtAuthEntryPoint unauthorizedHandler,
            JwtUtils jwtUtils) {
        this.userDetailsService = userDetailsService;
        this.unauthorizedHandler = unauthorizedHandler;
        this.jwtUtils = jwtUtils;
    }

    @Bean
    public JwtAuthTokenFilter authenticationJwtTokenFilter() {
        return new JwtAuthTokenFilter(jwtUtils, userDetailsService);
    }

    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder)
            throws Exception {
        // TODO
        authenticationManagerBuilder
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        // định dạng mẫu URL k bị phân quyền
        // assets - trang hình ảnh
        web.ignoring()
                .antMatchers(
                        "/**",
                        "/finishChangePassword");
    }

    @Override
    // cấu hình phân quyền
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()
                .and()
                .csrf()
                .disable()
                .exceptionHandling()
                .authenticationEntryPoint(unauthorizedHandler)
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()

                // HttpMethod - đặc tả method nếu cần thiết, nếu áp dụng cho tất cả thì k gọi gì
                // permitAll giống dòng 71, nhưng nó đi qua 1 cổng => k nên dùng thằng này, bỏ lên dòng 71
                // hasAnyRole cho phép nhìu quyền, nhìu nhóm user cùng lúc
                // hasRole: dùng với 1 quyền duy nhất

                // mỗi cái antMatchers là một cấu hình, đi với role, là quyền tương ứng với cấu hình đó
                .antMatchers("/update/**", "/products", "/product/add", "/products/**")
                .hasRole("SHOP")
                .antMatchers("/cart", "/checkout")
                .hasRole("USER")
                .antMatchers(HttpMethod.POST, "/product/**")
                .hasRole("USER")
                // những yêu cầu còn lại
                .anyRequest()
                .authenticated(); // yêu cầu quyền : ngoài dòng 71 và hàm này thì nó bắt đăng nhập mà k yêu
        // cầu quyền cụ thể

        http.addFilterBefore(
                authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    }
}
