package com.example.feature;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;

public class AutoLungeSwapFeature {
    public static void performAutoLungeSwap() {
        MinecraftClient client = MinecraftClient.getInstance();
        PlayerEntity player = client.player;
        if (player != null) {
            // Perform auto lunge swap logic
            player.setYaw(player.getYaw() + 180);
        }
    }
}