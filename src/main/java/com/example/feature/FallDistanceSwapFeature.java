package com.example.feature;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;

public class FallDistanceSwapFeature {
    private static final float FALL_DISTANCE_THRESHOLD = 3.0f;
    private static boolean isBreachActive = true;

    public static void checkFallDistanceAndSwap() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null) {
            PlayerEntity player = client.player;
            if (player.fallDistance > FALL_DISTANCE_THRESHOLD) {
                if (isBreachActive) {
                    // Swap to density
                    isBreachActive = false;
                } else {
                    // Swap to breach
                    isBreachActive = true;
                }
            }
        }
    }

    public static boolean isBreachActive() {
        return isBreachActive;
    }
}