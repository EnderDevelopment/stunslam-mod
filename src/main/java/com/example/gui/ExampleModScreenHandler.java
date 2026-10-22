package com.example.gui;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class ExampleModScreenHandler extends ScreenHandler {
    public ExampleModScreenHandler(ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }

    @Override
    public boolean canUse() {
        return true;
    }
}