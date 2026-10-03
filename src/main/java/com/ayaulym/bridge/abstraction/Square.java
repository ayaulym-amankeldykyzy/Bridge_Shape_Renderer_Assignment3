package com.ayaulym.bridge.abstraction;

import com.ayaulym.bridge.implementation.Renderer;

public class Square extends Shape {
    private final double side;

    public Square(Renderer renderer, double side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }
}
