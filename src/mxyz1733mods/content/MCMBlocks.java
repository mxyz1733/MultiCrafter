package mxyz1733mods.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mxyz1733mods.world.blocks.production.MultiCrafter;

public class MCMBlocks {
    public static MultiCrafter templateMultiCrafter;
    public static void load() {
        templateMultiCrafter = new MultiCrafter("template-multi-crafter") {{
           requirements(Category.crafting, ItemStack.with(Items.copper, 1));
        }};
    }
}
