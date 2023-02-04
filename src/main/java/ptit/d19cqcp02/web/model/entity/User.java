package ptit.d19cqcp02.web.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(
        name = "username",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"username"}),
                @UniqueConstraint(columnNames = {"email"})
        })
@Getter
@Setter
@Schema(hidden = true)
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String username;

  private String password;

  @NotNull(message = "Email name must not be null")
  @NotBlank(message = "Email name must not be blank")
  @Email(message = "Please input correct Email format")
  private String email;
  // private RoleName roleName;
  @ManyToOne(fetch = FetchType.LAZY)
  Role role;

  public User() {
    super();
  }

  public User(String username, String username1, String email, String encode) {
    super();
    // this.name = name;
    this.username = username;
    this.email = email;
    this.password = encode;
  }

  // @Transient
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    User other = (User) obj;
    return Objects.equals(id, other.id);
  }

}
