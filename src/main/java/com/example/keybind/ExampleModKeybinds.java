package com.example.keybind;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ExampleModKeybinds {
    public static KeyBinding stunSlamKey;
    public static KeyBinding attitudeSwapKey;
    public static KeyBinding autoLungeSwapKey;

    public static void registerKeybinds() {
        stunSlamKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.examplemod.stun_slam",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_R,
                "category.examplemod.keybinds"
        ));

        attitudeSwapKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.examplemod.attitude_swap",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_T,
                "category.examplemod.keybinds"
        ));

        autoLungeSwapKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.examplemod.auto_lunge_swap",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_Y,
                "category.examplemod.keybinds"
        ));
    }
}