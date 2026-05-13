package mxyz1733mods.ui;

import arc.scene.ui.layout.Table;
import mindustry.gen.Icon;
import mindustry.gen.Tex;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mxyz1733mods.world.meta.MCMRecipe;

public class MCMRecipeDisplay extends Table {

    public MCMRecipeDisplay(int recipeId) {
        this(MCMRecipe.all.get(recipeId));
    }

    public MCMRecipeDisplay(MCMRecipe recipe) {
        rebuild(recipe);
    }

    private void rebuild(MCMRecipe recipe) {
        clear();
        top().left().margin(0.0F);

        // 输入
        Table inputs = new Table(Tex.pane);
        for (ItemStack input : recipe.inputItems) {
            inputs.add(new ContentDisplay(input.item, input.amount));
        }
        inputs.row();
        for (LiquidStack input : recipe.inputLiquids) {
            inputs.add(new ContentDisplay(input.liquid, input.amount));
        }

        // 输出
        Table outputs = new Table(Tex.pane);
        for (ItemStack output : recipe.outputItems) {
            outputs.add(new ContentDisplay(output.item, output.amount));
        }
        outputs.row();
        for (LiquidStack output : recipe.outputLiquids) {
            outputs.add(new ContentDisplay(output.liquid, output.amount));
        }

        add(inputs).growX();
        image(Icon.right).tooltip(String.format("耗时: %ss", recipe.craftTime / 60.0f));
        add(outputs).growX();
    }
}
