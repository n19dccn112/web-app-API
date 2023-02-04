package ptit.d19cqcp02.web.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ptit.d19cqcp02.web.model.embeded.RateId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rates")
public class Rate {
    @EmbeddedId
    private RateId id;

    @Column(name = "comment")
    private String rateComment;

    @Column(name = "point")
    private Integer ratePoint;
}
