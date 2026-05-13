package mxyz1733mods.world.blocks.production;

import arc.scene.ui.layout.Table;
import mindustry.gen.Building;
import mindustry.gen.Icon;
import mindustry.ui.Styles;
import mindustry.world.Block;
import mxyz1733mods.ui.MultiCrafterEditorDialog;

public class MultiCrafter extends Block {
    public MultiCrafter(String name) {
        super(name);
        configurable = true;
        rotate = true;
        update = true;
    }


    public class MultiCrafterBuild extends Building {
        @Override
        public void buildConfiguration(Table table) {
            MultiCrafterEditorDialog dialog = new MultiCrafterEditorDialog();
            dialog.rebuild();
            table.button(Icon.settings, Styles.flati, dialog::show)
                    .size(60.0f, 60.0f)
                    .padTop(30.0f);
        }
    }
}
