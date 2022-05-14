package com.pixelninja.armors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class Armors implements ModInitializer {
    public static final String MOD_ID = "armors";

        public static EntityType<PuffinEntity> PUFFIN = Registry.register(Registry.ENTITY_TYPE,
                new Identifier(MOD_ID, "puffin"),
                FabricEntityTypeBuilder.create()
                        .entityFactory(PuffinEntity::new)
                        .spawnGroup(SpawnGroup.AMBIENT)
                        .dimensions(EntityDimensions.fixed(1.0f, 2.0f))
                        .build());
    ;

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(PUFFIN, PuffinEntity.createPuffinAttributes());

    }

}
