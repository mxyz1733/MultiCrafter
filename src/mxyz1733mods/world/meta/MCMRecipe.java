package mxyz1733mods.world.meta;

import arc.struct.Seq;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;

public class MCMRecipe {
    public static final Seq<MCMRecipe> all = new Seq<>();
    private final int recipeId;
    public float craftTime;
    public ItemStack[] inputItems;
    public ItemStack[] outputItems;
    public LiquidStack[] inputLiquids;
    public LiquidStack[] outputLiquids;

    public MCMRecipe(float craftTime, ItemStack[] inputItems, ItemStack[] outputItems, LiquidStack[] inputLiquids, LiquidStack[] outputLiquids) {
        this.craftTime = craftTime;
        this.inputItems = inputItems;
        this.outputItems = outputItems;
        this.inputLiquids = inputLiquids;
        this.outputLiquids = outputLiquids;
        all.add(this);
        recipeId = all.size;
    }

    public int getRecipeId() {
        return recipeId;
    }
}
