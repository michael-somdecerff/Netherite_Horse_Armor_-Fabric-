package com.frost2779.nha.mixin;

import com.frost2779.nha.NetheriteHorseArmor;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.HorseEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityFlammability {

    @Inject(at = @At("HEAD"), method = "damage(Lnet/minecraft/entity/damage/DamageSource;F)Z", cancellable = true)
    private void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity living = (LivingEntity) (Object) this;

        if(living instanceof HorseEntity) {
            HorseEntity horse = (HorseEntity) living;
            if (horse.getArmorType().getItem() == NetheriteHorseArmor.NETHERITE_HORSE_ARMOR &&
                    (source == DamageSource.IN_FIRE ||
                            source == DamageSource.ON_FIRE ||
                            source == DamageSource.LAVA) ||
                            source == DamageSource.HOT_FLOOR) {

                cir.setReturnValue(false);
            }
        }
    }
}
