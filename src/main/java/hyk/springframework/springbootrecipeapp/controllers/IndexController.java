package hyk.springframework.springbootrecipeapp.controllers;

import hyk.springframework.springbootrecipeapp.models.Recipe;
import hyk.springframework.springbootrecipeapp.services.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Htoo Yanant Khin
 */
@Slf4j
@RequiredArgsConstructor
@Controller
public class IndexController {
    private final RecipeService recipeService;

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        log.debug("Get index page ...");
        return "index";
    }
}
