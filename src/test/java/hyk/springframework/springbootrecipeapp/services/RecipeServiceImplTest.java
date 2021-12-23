package hyk.springframework.springbootrecipeapp.services;

import hyk.springframework.springbootrecipeapp.models.Recipe;
import hyk.springframework.springbootrecipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author Htoo Yanant Khin
 */
class RecipeServiceImplTest {
    RecipeServiceImpl recipeService;
    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() {
        Recipe r1 = new Recipe();
        r1.setId(1L);
        Recipe r2 = new Recipe();
        r2.setId(2L);
        Recipe r3 = new Recipe();
        r3.setId(3L);
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(r1);
        recipes.add(r2);
        recipes.add(r3);

        when(recipeRepository.findAll()).thenReturn(recipes);

        assertEquals(recipes.size(), 3);
        verify(recipeRepository, times(1));
    }
}