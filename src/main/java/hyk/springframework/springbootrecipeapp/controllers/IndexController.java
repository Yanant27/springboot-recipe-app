package hyk.springframework.springbootrecipeapp.controllers;

import hyk.springframework.springbootrecipeapp.models.Recipe;
import hyk.springframework.springbootrecipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Htoo Yanant Khin
 */
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
//        for (Recipe recipe : recipeService.getRecipes()) {
//            System.out.println(recipe.getId() + ", " + recipe.getDescription() + ", " +
//                    recipe.getDifficulty());
//        }
        return "index";
    }
}
