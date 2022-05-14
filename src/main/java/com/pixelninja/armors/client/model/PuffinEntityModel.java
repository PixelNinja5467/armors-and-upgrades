package com.pixelninja.armors.client.model;

import com.pixelninja.armors.Armors;
import com.pixelninja.armors.PuffinEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PuffinEntityModel extends AnimatedGeoModel<PuffinEntity> {

    @Override
    public Identifier getModelLocation(PuffinEntity object) {
        return new Identifier(Armors.MOD_ID, "geo/entity/puffin.geo.json");
    }

    @Override
    public Identifier getTextureLocation(PuffinEntity object) {
        return new Identifier(Armors.MOD_ID, "textures/entity/puffin.png");
    }

    @Override
    public Identifier getAnimationFileLocation(PuffinEntity animatable) {
        return new Identifier(Armors.MOD_ID, "animations/entity/puffin.animation.json");
    }
}
