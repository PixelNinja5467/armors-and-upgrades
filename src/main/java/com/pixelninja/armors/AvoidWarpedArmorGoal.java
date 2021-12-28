package com.pixelninja.armors;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.TrackTargetGoal;
import net.minecraft.entity.ai.pathing.MobNavigation;
import net.minecraft.entity.mob.HoglinEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;

public class AvoidWarpedArmorGoal extends EscapeDangerGoal {

    LivingEntity target = mob.getTarget();

    public AvoidWarpedArmorGoal(PathAwareEntity mob, double speed) {
        super(mob, speed);
    }


    @Override
    public boolean canStart() {
        if (target != null){
            return target.getEquippedStack(EquipmentSlot.CHEST).isOf(Armors.WARPED_CHESTPLATE);
        }
        return false;
    }

   /* @Override
    public void start() {
        assert target != null;
        mob.getNavigation().
        entity.getMoveControl().moveTo(-target.getX(), -target.getY(), -target.getZ(), entity.getMovementSpeed());
        super.start();
    } */
}
