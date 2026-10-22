package com.example.gui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ExampleModScreen extends Screen {
    public ExampleModScreen(Text title) {
        super(title);
    }

    @Override
    protected void init() {
        super.init();
        // Initialize GUI elements
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        // Render GUI elements
    }
}