package com.frost2779.nha;

import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.Identifier;

public class NetheriteArmorItem extends HorseArmorItem {

    private final String entityTexture;

    public NetheriteArmorItem(int bonus, String name, Settings settings) {
        super(bonus, name, settings);
        this.entityTexture = "nha:textures/entity/horse/armor/horse_armor_" + name + ".png";
    }

    @Override
    public Identifier getEntityTexture() {
        return new Identifier(entityTexture);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
