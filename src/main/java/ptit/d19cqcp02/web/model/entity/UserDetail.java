package ptit.d19cqcp02.web.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "userdetails")
@Getter
@Setter
@Schema(hidden = true)
public class UserDetail {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String firstName;

    @Column(nullable = true)
    private String lastName;

    @Column(nullable = true)
    private String address;

    @OneToOne(optional = false)
    @PrimaryKeyJoinColumn
    private User user;

    public UserDetail(Long id, String firstName, String lastName, String address, User user) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        // this.user = user;
    }

    public UserDetail() {
    }

    @Override
    public String toString() {
        return "UserDetail{"
                + "id="
                + id
                + ", firstName='"
                + firstName
                + '\''
                + ", lastName='"
                + lastName
                + '\''
                + ", address='"
                + address
                + '\''
                + ", user="
                + user
                + '}';
    }
}
