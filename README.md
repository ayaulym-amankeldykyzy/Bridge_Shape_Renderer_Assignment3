# Bridge Pattern — Shape–Renderer

## Description
This project demonstrates the Bridge structural design pattern using two independently varying hierarchies:

- **Abstraction:** Shape
- **Refined Abstractions:** Circle, Square
- **Implementor:** Renderer
- **Concrete Implementors:** VectorRenderer, RasterRenderer

The `Shape` hierarchy is connected to the `Renderer` hierarchy through composition. A shape receives a renderer at runtime, so the rendering implementation can be changed without modifying the shape classes.

## Requirements
- Java JDK 17
- IntelliJ IDEA

## Run
Run `com.ayaulym.bridge.Main`.

## Example output
```text
=== Vector Renderer ===
Drawing circle as vector graphics, radius = 5.0
Drawing square as vector graphics, side = 4.0

=== Raster Renderer ===
Drawing circle as raster graphics, radius = 5.0
Drawing square as raster graphics, side = 4.0

=== Runtime implementation switch ===
Drawing circle as vector graphics, radius = 3.0
Drawing circle as raster graphics, radius = 3.0
```
