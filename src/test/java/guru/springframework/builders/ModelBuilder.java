package guru.springframework.builders;

import guru.springframework.model.Recipe;
import lombok.Builder;

public class ModelBuilder {

    @Builder(builderMethodName = "recipeBuilder")
    private static Recipe newRecipe(Long id) {
        Recipe recipe = new Recipe();
        recipe.setId(id);
        return recipe;
    }

}
