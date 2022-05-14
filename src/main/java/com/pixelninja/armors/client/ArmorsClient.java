package com.pixelninja.armors.client;

import com.pixelninja.armors.Armors;
import com.pixelninja.armors.client.model.PuffinEntityModel;
import com.pixelninja.armors.client.render.PuffinEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ArmorsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Armors.PUFFIN, (context) -> new PuffinEntityRenderer(context, new PuffinEntityModel()));

    }
}
