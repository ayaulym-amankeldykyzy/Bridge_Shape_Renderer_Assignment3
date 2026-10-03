package com.ayaulym.bridge.abstraction;

import com.ayaulym.bridge.implementation.Renderer;

public abstract class Shape {
    protected final Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
