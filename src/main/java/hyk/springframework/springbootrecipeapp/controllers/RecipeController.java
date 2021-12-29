package hyk.springframework.springbootrecipeapp.controllers;

import hyk.springframework.springbootrecipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Htoo Yanant Khin
 */
@Slf4j
@Controller
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe/show/{id}")
    public String findById(@PathVariable Long id, Model model) {
        model.addAttribute("recipe", recipeService.findById(id));
        log.debug("Get show page ...");
        return "recipe/show";
    }
}
