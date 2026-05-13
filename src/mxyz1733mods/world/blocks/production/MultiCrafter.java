package mxyz1733mods.world.blocks.production;

import arc.scene.ui.layout.Table;
import arc.struct.Seq;
import mindustry.gen.Building;
import mindustry.gen.Icon;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.ui.Styles;
import mindustry.world.Block;
import mxyz1733mods.ui.MultiCrafterEditorDialog;
import mxyz1733mods.world.meta.MCMRecipe;

public class MultiCrafter extends Block {
    public Seq<MCMRecipe> recipes = new Seq<>();

    public MultiCrafter(String name) {
        super(name);
        configurable = true;
        rotate = true;
        update = true;
    }

    public void addRecipe(float craftTime, ItemStack[] inputItems, ItemStack[] outputItems, LiquidStack[] inputLiquids, LiquidStack[] outputLiquids) {
        addRecipe(new MCMRecipe(craftTime, inputItems, outputItems, inputLiquids, outputLiquids));
    }

    public void addRecipe(MCMRecipe recipe) {
        recipes.add(recipe);
    }


    public class MultiCrafterBuild extends Building {
        @Override
        public void buildConfiguration(Table table) {
            MultiCrafterEditorDialog dialog = new MultiCrafterEditorDialog(recipes);
            dialog.rebuild();
            table.button(Icon.settings, Styles.flati, dialog::show)
                    .size(60.0f, 60.0f)
                    .padTop(30.0f);
        }
    }
}
