package hyk.springframework.springbootrecipeapp.repositories;

import hyk.springframework.springbootrecipeapp.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Htoo Yanant Khin
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
    /*
     * Spring Data JPA Query Method => findBy+property name
     * Don't need to write SQL and Spring will provide implementation at runtime
     * Optional -> never return null, use as a method return type
     *             no value => isPresent() is false, value => isPresent() is true
     */
    Optional<Category> findByDescription(String description);
}
