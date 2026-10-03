package com.ayaulym.bridge;

import com.ayaulym.bridge.abstraction.Circle;
import com.ayaulym.bridge.abstraction.Shape;
import com.ayaulym.bridge.abstraction.Square;
import com.ayaulym.bridge.implementation.RasterRenderer;
import com.ayaulym.bridge.implementation.Renderer;
import com.ayaulym.bridge.implementation.VectorRenderer;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape vectorCircle = new Circle(vectorRenderer, 5);
        Shape vectorSquare = new Square(vectorRenderer, 4);

        Shape rasterCircle = new Circle(rasterRenderer, 5);
        Shape rasterSquare = new Square(rasterRenderer, 4);

        System.out.println("=== Vector Renderer ===");
        vectorCircle.draw();
        vectorSquare.draw();

        System.out.println("\n=== Raster Renderer ===");
        rasterCircle.draw();
        rasterSquare.draw();

        System.out.println("\n=== Runtime implementation switch ===");
        Shape circle = new Circle(vectorRenderer, 3);
        circle.draw();

        circle = new Circle(rasterRenderer, 3);
        circle.draw();
    }
}
