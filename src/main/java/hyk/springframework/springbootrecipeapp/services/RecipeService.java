package hyk.springframework.springbootrecipeapp.services;

import hyk.springframework.springbootrecipeapp.models.Recipe;

import java.util.Set;

/**
 * @author Htoo Yanant Khin
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
