package com.pixelninja.armors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class Armors implements ModInitializer {
    public String MOD_ID = "armors";

    public static Item WARPED_CHESTPLATE = new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));


    @Override
    public void onInitialize() {
        WARPED_CHESTPLATE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_chestplate"), WARPED_CHESTPLATE);
    }

}
