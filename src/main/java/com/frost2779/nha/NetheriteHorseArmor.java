package com.frost2779.nha;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.BinomialLootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NetheriteHorseArmor implements ModInitializer {
	public static final NetheriteArmorItem NETHERITE_HORSE_ARMOR = new NetheriteArmorItem(17, "netherite", new FabricItemSettings().maxCount(1).group(ItemGroup.MISC));
	public static final Identifier NETHER_BASTION_CHEST = new Identifier("minecraft", "chests/bastion_treasure");

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("nha", "netherite_horse_armor"), NETHERITE_HORSE_ARMOR);
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if(NETHER_BASTION_CHEST.equals(id)){
				FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
						.rolls(BinomialLootNumberProvider.create(1, 0.3f))
						.with(ItemEntry.builder(NETHERITE_HORSE_ARMOR));

				supplier.pool(poolBuilder);
			}
		});
	}
}
