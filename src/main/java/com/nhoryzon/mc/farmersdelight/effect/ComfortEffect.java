package com.nhoryzon.mc.farmersdelight.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Set;

public class ComfortEffect extends StatusEffect {
    public ComfortEffect() {
        super(StatusEffectType.BENEFICIAL, 0);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.hasStatusEffect(StatusEffects.REGENERATION)) {
            return;
        }
        if (entity instanceof PlayerEntity player) {
            if (player.getHungerManager().getSaturationLevel() > 0.0) {
                return;
            }
        }
        if (entity.getHealth() < entity.getMaxHealth()) {
            entity.heal(1.0F);
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 80 == 0;
    }
}