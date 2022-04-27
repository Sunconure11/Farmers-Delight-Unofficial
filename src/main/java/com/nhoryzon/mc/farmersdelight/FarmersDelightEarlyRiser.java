package com.nhoryzon.mc.farmersdelight;

import com.chocohead.mm.api.ClassTinkerers;
import com.mojang.logging.LogUtils;
import com.nhoryzon.mc.farmersdelight.util.ModdedErrStream;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.MappingResolver;

public class FarmersDelightEarlyRiser implements Runnable {
    @Override
    public void run() {
        MappingResolver remapper = FabricLoader.getInstance().getMappingResolver();
        String enchantmentTarget = remapper.mapClassName("intermediary", "net.minecraft.class_1886");
        ClassTinkerers.enumBuilder(enchantmentTarget, new Class[0]).addEnumSubclass("KNIFE", "com.nhoryzon.mc.farmersdelight.enchantment.KnifeEnchantmentTarget").build();
    }
    static {
        System.setErr(new ModdedErrStream("STDERR", System.err, LogUtils.getLogger().isDebugEnabled()));
    }
}
