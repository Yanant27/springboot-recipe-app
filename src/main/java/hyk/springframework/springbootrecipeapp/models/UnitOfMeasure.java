package hyk.springframework.springbootrecipeapp.models;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Htoo Yanant Khin
 */
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
