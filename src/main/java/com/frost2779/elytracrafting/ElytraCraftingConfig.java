package com.frost2779.elytracrafting;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = ElytraCrafting.MOD_ID)
public class ElytraCraftingConfig implements ConfigData {

    @ConfigEntry.Category("Crafting Settings")
    @ConfigEntry.Gui.Tooltip()
    public boolean enablePreEndMode = false;
}
