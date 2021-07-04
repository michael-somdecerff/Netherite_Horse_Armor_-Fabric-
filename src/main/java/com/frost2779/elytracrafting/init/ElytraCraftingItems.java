package com.frost2779.elytracrafting.init;

import com.frost2779.elytracrafting.ElytraCrafting;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ElytraCraftingItems {
    public static final Item REINFORCED_STICK = register("reinforced_stick");
    public static final Item REINFORCED_LEATHER_SQUARE = register("reinforced_leather_square");

    public static final Item HARDENED_LEATHER = register("hardened_leather");
    public static final Item DIAMOND_REINFORCED_STICK = register("diamond_reinforced_stick");
    public static final Item DIAMOND_REINFORCED_HARD_LEATHER_SQUARE = register("diamond_reinforced_hard_leather_square");
    public static final Item DIAMOND_REINFORCED_WING = register("diamond_reinforced_wing");
    public static final Item DIAMOND_HARNESS  = register("diamond_harness");

    public static final Item ENDER_INFUSED_LEATHER = register("ender_infused_leather");
    public static final Item ENDER_INFUSED_LEATHER_SQUARE = register("ender_infused_leather_square");
    public static final Item ENDER_INFUSED_WING = register("ender_infused_wing");
    public static final Item ENDER_INFUSED_HARNESS = register("ender_infused_harness");
    public static final Item ENDER_PEARL_DUST = register("ender_pearl_dust");

    private static Item register(String id) {
        return register(id, Config.SETTINGS);
    }

    private static Item register(String id, FabricItemSettings settings) {
        Item item = new Item(settings);
        Registry.register(Registry.ITEM, new Identifier(ElytraCrafting.MOD_ID, id), item);
        return item;
    }

    public static void init() {}

    public static class Config {
        public static final FabricItemSettings SETTINGS = new FabricItemSettings().group(ElytraCrafting.ITEM_GROUP);
    }
}
