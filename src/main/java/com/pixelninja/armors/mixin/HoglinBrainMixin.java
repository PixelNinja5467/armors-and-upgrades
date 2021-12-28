package com.pixelninja.armors.mixin;

import com.pixelninja.armors.Armors;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.brain.EntityLookTarget;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.mob.HoglinBrain;
import net.minecraft.entity.mob.HoglinEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.Optional;

@Mixin(HoglinBrain.class)
public abstract class HoglinBrainMixin {


    @Shadow
    protected static void avoidEnemy(HoglinEntity hoglin, LivingEntity target) {
    }

    @Inject(method = "targetEnemy", at = @At("HEAD"))
    private static void avoidWarpedArmor(HoglinEntity hoglin, LivingEntity target, CallbackInfo ci) {
        if (target.getEquippedStack(EquipmentSlot.CHEST).isOf(Armors.WARPED_CHESTPLATE)) {
            avoidEnemy(hoglin, target);
        }
    }

}
