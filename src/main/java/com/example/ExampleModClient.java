package com.example;

import net.fabricmc.api.ClientModInitializer;

public class ExampleModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
                ExampleModKeybinds.registerKeybinds();
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            FallDistanceSwapFeature.checkFallDistanceAndSwap();
            while (ExampleModKeybinds.stunSlamKey.wasPressed()) {
                StunSlamFeature.performStunSlam();
            }
            while (ExampleModKeybinds.attitudeSwapKey.wasPressed()) {
                AttitudeSwapFeature.performAttitudeSwap();
            }
            while (ExampleModKeybinds.autoLungeSwapKey.wasPressed()) {
                AutoLungeSwapFeature.performAutoLungeSwap();
            }
        });
    }
}