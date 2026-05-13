package mxyz1733mods.ui;

import arc.Core;
import arc.graphics.g2d.TextureRegion;
import arc.scene.ui.Image;
import arc.scene.ui.layout.Stack;
import arc.scene.ui.layout.Table;
import arc.util.Nullable;
import arc.util.Scaling;
import mindustry.core.UI;
import mindustry.ctype.UnlockableContent;
import mindustry.ui.Styles;
import mindustry.world.meta.StatValues;

public class ContentDisplay extends Table {
    public ContentDisplay(@Nullable UnlockableContent content, float amount) {
        rebuild(content, amount);
    }

    private void rebuild(@Nullable UnlockableContent content, float amount) {
        clear();
        top().left().margin(0.0F);
        add(stack(content, amount, true));
    }

    private static Stack stack(@Nullable UnlockableContent content, float amount, boolean tooltip) {
        Stack stack = new Stack();
        stack.add(new Table(o -> {
            o.left();
            o.image(content != null ? content.uiIcon : Core.atlas.find("error")).size(32.0F).scaling(Scaling.fit);
        }));
        if (amount != 0) {
            stack.add(new Table(t -> {
                t.left().bottom();
                t.add(amount >= 1000 ? UI.formatAmount((long)amount) : amount + "")
                        .name("stack amount")
                        .style(Styles.outlineLabel);
                t.pack();
            }));
        }

        StatValues.withTooltip(stack, content, tooltip);
        return stack;
    }
}
