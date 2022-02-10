package hyk.springframework.springbootrecipeapp.services;

import hyk.springframework.springbootrecipeapp.converters.RecipeCommandToRecipe;
import hyk.springframework.springbootrecipeapp.converters.RecipeToRecipeCommand;
import hyk.springframework.springbootrecipeapp.exceptions.NotFoundException;
import hyk.springframework.springbootrecipeapp.models.Recipe;
import hyk.springframework.springbootrecipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {
    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Mock
    RecipeCommandToRecipe recipeCommandToRecipe;

    @Mock
    RecipeToRecipeCommand recipeToRecipeCommand;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository, recipeCommandToRecipe, recipeToRecipeCommand);
    }

    @Test
    void getRecipesTest() {
        Set<Recipe> recipesData = new HashSet<>();
        Recipe recipe1 = new Recipe();
        recipe1.setId(1L);
        Recipe recipe2 = new Recipe();
        recipe2.setId(2L);
        recipesData.add(recipe1);
        recipesData.add(recipe2);
        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> resultData = recipeService.getRecipes();
        assertEquals(2,resultData.size());
        verify(recipeRepository, times(1)).findAll();
    }

    @Test
    void getRecipeByIdTest() throws Exception {
        Recipe recipe = new Recipe();
        recipe.setId(1L);
        Optional<Recipe> recipeOptional = Optional.of(recipe);

        when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);
        Recipe returnRecipe = recipeService.findById(1L);
        assertNotNull(returnRecipe);
        verify(recipeRepository, times(1)).findById(anyLong());
    }

    @Test
    void getRecipeByIdTestNotFound() throws Exception {
        Recipe recipe = new Recipe();
        recipe.setId(1L);
        Optional<Recipe> recipeOptional = Optional.of(recipe);

        when(recipeRepository.findById(1L)).thenReturn(recipeOptional);
        Exception exception = assertThrows(NotFoundException.class, () -> recipeService.findById(2L) );
        verify(recipeRepository, times(1)).findById(anyLong());
        assertEquals("Recipe not found !", exception.getMessage());
    }

    @Test
    void findCommandById() {
    }

    @Test
    void saveRecipeCommand() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void testGetRecipes() {
    }

    @Test
    void testFindById() {
    }

    @Test
    void testFindCommandById() {
    }

    @Test
    void testSaveRecipeCommand() {
    }

    @Test
    void testDeleteById() {
    }
}