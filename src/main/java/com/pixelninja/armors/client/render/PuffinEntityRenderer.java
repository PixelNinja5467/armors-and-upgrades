package com.pixelninja.armors.client.render;

import com.pixelninja.armors.PuffinEntity;
import com.pixelninja.armors.client.model.PuffinEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PuffinEntityRenderer extends GeoEntityRenderer<PuffinEntity> {

    public PuffinEntityRenderer(EntityRendererFactory.Context ctx, AnimatedGeoModel<PuffinEntity> modelProvider) {
        super(ctx, new PuffinEntityModel());
    }


}
