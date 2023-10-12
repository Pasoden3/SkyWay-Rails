package com.univarsalmodgroup.univarsalgames.skyway_rails.forge;

import dev.architectury.platform.forge.EventBuses;
import com.univarsalmodgroup.univarsalgames.skyway_rails.SkyWayRails;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SkyWayRails.MOD_ID)
public class SkyWayRailsForge {
    public SkyWayRailsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(SkyWayRails.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            SkyWayRails.init();
    }
}