package com.frost2779.nha;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NetheriteHorseArmor implements ModInitializer {
	public static final ModdedHorseArmorItem NETHERITE_HORSE_ARMOR = new ModdedHorseArmorItem(17, "netherite", new FabricItemSettings().maxCount(1).group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("nha", "netherite_horse_armor"), NETHERITE_HORSE_ARMOR);
	}
}
