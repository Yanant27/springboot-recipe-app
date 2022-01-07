package hyk.springframework.springbootrecipeapp.commands;

import hyk.springframework.springbootrecipeapp.models.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Htoo Yanant Khin
 */
@Setter
@Getter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer serving;
    private String source;
    private String  url;
    private String direction;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Difficulty difficulty;
    private NotesCommand note;
    private Set<CategoryCommand> categories = new HashSet<>();
}
