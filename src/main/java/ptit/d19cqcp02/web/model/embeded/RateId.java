package ptit.d19cqcp02.web.model.embeded;

import lombok.*;
import ptit.d19cqcp02.web.model.entity.Product;
import ptit.d19cqcp02.web.model.entity.User;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RateId implements Serializable {
    @ManyToOne
    private Product product;
    @ManyToOne
    private User user;
}
