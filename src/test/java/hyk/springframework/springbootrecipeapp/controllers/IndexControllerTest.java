package hyk.springframework.springbootrecipeapp.controllers;

import hyk.springframework.springbootrecipeapp.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class IndexControllerTest {
    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController indexController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        indexController = new IndexController(recipeService);

    }

    @Test
    void getIndexPageTest() {
        String pageName = indexController.getIndexPage(model);
        assertEquals("index", pageName);
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
    }
}