package com.example.feature;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

public class StunSlamFeature {
    public static void performStunSlam() {
        MinecraftClient client = MinecraftClient.getInstance();
        PlayerEntity player = client.player;
        if (player != null) {
            // Perform stun slam logic
            Vec3d velocity = player.getVelocity();
            player.setVelocity(velocity.x, -1.0, velocity.z);
        }
    }
}