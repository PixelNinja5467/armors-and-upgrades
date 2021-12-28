package com.pixelninja.armors.mixin;


import com.pixelninja.armors.AvoidWarpedArmorGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HoglinEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(HoglinEntity.class)
public abstract class HoglinEntityMixin extends AnimalEntity {


    protected HoglinEntityMixin(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new AvoidWarpedArmorGoal((HoglinEntity) (Object)this, this.getMovementSpeed() * 1.5));
        super.initGoals();
    }
}
