package mxyz1733mods.ui;

import arc.struct.Seq;
import mindustry.gen.Icon;
import mindustry.gen.Tex;
import mindustry.ui.Styles;
import mindustry.ui.dialogs.BaseDialog;
import mxyz1733mods.world.meta.MCMRecipe;

public class MultiCrafterEditorDialog extends BaseDialog {
    private final Seq<MCMRecipe> recipes;

    public MultiCrafterEditorDialog(Seq<MCMRecipe> recipes) {
        super("@multi-crafter-editor-dialog");
        this.recipes = recipes;
    }

    public void rebuild() {
        // 侧边栏
        cont.table(Tex.pane,aside -> {
            aside.top(); // 将布局方式更改为从顶部向下
            aside.defaults().height(60.0f).growX();
            aside.button("添加配方", Icon.add, Styles.flatt, () -> {

            });
        }).left().width(240.0f).growY();

        // 主体部分
        cont.table(Tex.pane,main -> {
            for (MCMRecipe recipe : recipes) {
                main.add(new MCMRecipeDisplay(recipe)).growX().row();
            }
        }).grow();

        closeOnBack();
    }
}
