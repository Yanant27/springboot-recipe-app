package hyk.springframework.springbootrecipeapp.commands;

import hyk.springframework.springbootrecipeapp.models.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Htoo Yanant Khin
 */
@Setter
@Getter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private String recipeNotes;
}
