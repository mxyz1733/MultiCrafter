package mxyz1733mods.ui;

import arc.scene.ui.layout.Table;
import mxyz1733mods.world.meta.MCMRecipe;

public class MCMRecipeDisplay extends Table {

    public MCMRecipeDisplay(int recipeId) {
        this(MCMRecipe.all.get(recipeId));
    }

    public MCMRecipeDisplay(MCMRecipe recipe) {
        rebuild(recipe);
    }

    private void rebuild(MCMRecipe recipe) {
        /// TODO
    }
}
