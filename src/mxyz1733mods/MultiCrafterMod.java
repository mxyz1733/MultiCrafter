package mxyz1733mods;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mxyz1733mods.content.MCMBlocks;

public class MultiCrafterMod extends Mod{

    public MultiCrafterMod(){
        Log.info("Loaded MultiCrafterMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            /// TODO
        });
    }

    @Override
    public void loadContent() {
        MCMBlocks.load();
    }

}
