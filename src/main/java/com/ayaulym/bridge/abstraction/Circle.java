package com.ayaulym.bridge.abstraction;

import com.ayaulym.bridge.implementation.Renderer;

public class Circle extends Shape {
    private final double radius;

    public Circle(Renderer renderer, double radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
}
