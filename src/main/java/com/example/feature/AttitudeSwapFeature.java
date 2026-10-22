package com.example.feature;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;

public class AttitudeSwapFeature {
    public static void performAttitudeSwap() {
        MinecraftClient client = MinecraftClient.getInstance();
        PlayerEntity player = client.player;
        if (player != null) {
            // Perform attitude swap logic
            player.setPitch(player.getPitch() * -1);
        }
    }
}