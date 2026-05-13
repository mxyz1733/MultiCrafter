package mxyz1733mods.ui;

import arc.Core;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.gen.Icon;
import mindustry.gen.Tex;
import mindustry.type.Liquid;
import mindustry.ui.Styles;
import mindustry.ui.dialogs.BaseDialog;

public class MultiCrafterEditorDialog extends BaseDialog {
    public MultiCrafterEditorDialog() {
        super("@multi-crafter-editor-dialog");
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
//            main.add("TODO").grow();
            main.add(new ContentDisplay(Items.copper, 1_000_000_000));
            main.add(new ContentDisplay(Liquids.slag, 1_000_000_000));
        }).grow();

        closeOnBack();
    }
}
