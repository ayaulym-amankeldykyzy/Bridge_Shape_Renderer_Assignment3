package com.ayaulym.bridge.implementation;

public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing circle as raster graphics, radius = " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square as raster graphics, side = " + side);
    }
}
