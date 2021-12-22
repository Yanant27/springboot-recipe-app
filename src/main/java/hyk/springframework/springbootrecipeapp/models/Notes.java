package hyk.springframework.springbootrecipeapp.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author Htoo Yanant Khin
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private String notes;
    @OneToOne
    private Recipe recipe;
}
