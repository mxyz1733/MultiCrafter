package mxyz1733mods.content;

import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mxyz1733mods.world.blocks.production.MultiCrafter;

public class MCMBlocks {
    public static MultiCrafter templateMultiCrafter;
    public static void load() {
        templateMultiCrafter = new MultiCrafter("template-multi-crafter") {{
           requirements(Category.crafting, ItemStack.with(Items.copper, 1));
           addRecipe(600.0f,
                   ItemStack.with(Items.copper, 1_000_000_000),
                   ItemStack.with(Items.titanium, 2),
                   LiquidStack.with(Liquids.slag, 1),
                   LiquidStack.with(Liquids.water, 1)
                   );
           addRecipe(60.0f,
                   ItemStack.with(Items.graphite, 1_000_000_000),
                   ItemStack.with(Items.titanium, 2),
                   LiquidStack.with(Liquids.water, 1),
                   LiquidStack.with()
                   );
           addRecipe(300.0f,
                   ItemStack.with(),
                   ItemStack.with(Items.titanium, 2),
                   LiquidStack.with(),
                   LiquidStack.with(Liquids.water, 1)
                   );
        }};
    }
}
