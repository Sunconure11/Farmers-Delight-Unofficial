package com.nhoryzon.mc.farmersdelight.enchantment;

import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import com.nhoryzon.mc.farmersdelight.mixin.EnchantmentTargetMixin;
import net.minecraft.item.Item;

public class KnifeEnchantmentTarget extends EnchantmentTargetMixin {
    @Override
    public boolean isAcceptableItem(Item item) {
        return item instanceof KnifeItem;
    }
}
