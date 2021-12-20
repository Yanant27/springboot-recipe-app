package hyk.springframework.springbootrecipeapp.repositories;

import hyk.springframework.springbootrecipeapp.models.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Htoo Yanant Khin
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
