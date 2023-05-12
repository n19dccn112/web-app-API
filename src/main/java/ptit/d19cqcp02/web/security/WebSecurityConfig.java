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
                .antMatchers(HttpMethod.POST,
                        "/api/auth/**",
                        "/api/v1/public**",
                        "/swagger-ui**",
                        "/swagger-ui/**",
                        "/v3/api-docs/**");
        web.ignoring()
                .antMatchers(HttpMethod.GET,
                        "/api/auth/**",
                        "/api/v1/public**",
                        "/swagger-ui**",
                        "/swagger-ui/**",
                        "/v3/api-docs/**",
                        "/api/categories**",
                        "/api/categories/**",
                        "/api/images**",
                        "/api/images/**",
                        "/api/rates**",
                        "/api/rates/**",
                        "/api/features**",
                        "/api/features/**",
                        "/api/featureTypes**",
                        "/api/featureTypes/**",
                        "/api/products/**",
                        "/api/products**",
                        "/api/event/**",
                        "/api/event**",
                        "/api/orders/**",
                        "/api/orders**");
    }

    @Override
    // cấu hình phân quyền
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,
                        "/api/auth/changePass**")
                .hasAnyRole("USER", "PM", "ADMIN")
                .antMatchers(HttpMethod.POST,
                        "/api/auth/**",
                        "/api/v1/public**",
                        "/swagger-ui**",
                        "/swagger-ui/**",
                        "/v3/api-docs/**")
                .hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,
                        "/api/auth/**",
                        "/api/v1/public**",
                        "/swagger-ui**",
                        "/swagger-ui/**",
                        "/v3/api-docs/**",
                        "/api/categories**",
                        "/api/categories/**",
                        "/api/images**",
                        "/api/images/**",
                        "/api/rates**",
                        "/api/rates/**",
                        "/api/features**",
                        "/api/features/**",
                        "/api/featureTypes**",
                        "/api/featureTypes/**",
                        "/api/products/**",
                        "/api/products**",
                        "/api/event/**",
                        "/api/event**",
                        "/api/orders/**",
                        "/api/orders**",
                        "/api/users/**",
                        "/api/users**")
                .hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE,
                        "/api/v1/admin**",
                        "/api/categories**",
                        "/api/categories/**",
                        "/api/images**",
                        "/api/images/**",
                        "/api/users**",
                        "/api/users/**",
                        "/api/features**",
                        "/api/features/**",
                        "/api/featureTypes**",
                        "/api/featureTypes/**",
                        "/api/products/**",
                        "/api/products**",
                        "/api/event/**",
                        "/api/events**",
                        "/api/orders/**",
                        "/api/orders**")
                .hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT,
                        "/api/v1/admin**",
                        "/api/categories**",
                        "/api/categories/**",
                        "/api/images**",
                        "/api/images/**",
                        "/api/users**",
                        "/api/users/**",
                        "/api/features**",
                        "/api/features/**",
                        "/api/featureTypes**",
                        "/api/featureTypes/**",
                        "/api/products/**",
                        "/api/products**",
                        "/api/event/**",
                        "/api/events**",
                        "/api/orders/**",
                        "/api/orders**")
                .hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,
                        "/api/rates**",
                        "/api/rates/**",
                        "/api/orders**",
                        "/api/orders/**",
                        "/api/orderDetails/**",
                        "/api/orderDetails**",
                        "/api/orderDetailViews",
                        "/api/event/**",
                        "/api/event**")
                .hasRole("USER")
                .antMatchers(HttpMethod.POST,
                        "api/rates**",
                        "/api/orders**",
                        "/api/orders/**",
                        "/api/orderDetails/**",
                        "/api/orderDetails**",
                        "/api/orderDetailViews",
                        "/api/event/**",
                        "/api/event**")
                .hasRole("USER")
                .antMatchers(HttpMethod.DELETE,
                        "/api/rates**",
                        "/api/orders**",
                        "/api/orders/**",
                        "/api/orderDetails/**",
                        "/api/orderDetails**",
                        "/api/orderDetailViews")
                .hasRole("USER")
                .antMatchers(HttpMethod.PUT,
                        "/api/rates**",
                        "/api/orders**",
                        "/api/orders/**",
                        "/api/orderDetails/**",
                        "/api/orderDetails**",
                        "/api/orderDetailViews")
                .hasRole("USER")
                .antMatchers(
                        "/api/v1/**")
                .hasAnyRole("USER", "PM", "ADMIN")
                .anyRequest().authenticated();

        http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    }
}
