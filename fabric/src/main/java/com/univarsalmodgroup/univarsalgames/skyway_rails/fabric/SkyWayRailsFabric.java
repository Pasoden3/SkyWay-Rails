package com.univarsalmodgroup.univarsalgames.skyway_rails.fabric;

import com.univarsalmodgroup.univarsalgames.skyway_rails.SkyWayRails;
import net.fabricmc.api.ModInitializer;

public class SkyWayRailsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SkyWayRails.init();
    }
}