package com.frost2779.elytracrafting;

import com.frost2779.elytracrafting.init.ElytraCraftingItems;
import com.frost2779.elytracrafting.init.ElytraCraftingRecipes;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ElytraCrafting implements ModInitializer {
    public static final String MOD_ID = "elytracrafting";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("elytracrafting", "tabgeneral"),
            () -> new ItemStack(ElytraCraftingItems.ENDER_PEARL_DUST)
    );
    public static ElytraCraftingConfig ecmConfig;

    @Override
    public void onInitialize() {
        AutoConfig.register(ElytraCraftingConfig.class, GsonConfigSerializer::new);
        ecmConfig = AutoConfig.getConfigHolder(ElytraCraftingConfig.class).getConfig();

        ElytraCraftingItems.init();
        ElytraCraftingRecipes.init();
    }
}
