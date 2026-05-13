package mxyz1733mods;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mxyz1733mods.content.MCMBlocks;

public class MultiCrafterMod extends Mod{

    public MultiCrafterMod(){
        Log.info("Loaded MultiCrafterMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'mxyz1733mods-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("mxyz1733mods-java-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent() {
        MCMBlocks.load();
    }

}
