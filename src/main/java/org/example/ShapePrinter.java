package org.example;

public class ShapePrinter {
    public void printShapeInfo(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Circle circle = new Circle();
        printer.printShapeInfo(circle);

        Rectangle rectangle = new Rectangle();
        printer.printShapeInfo(rectangle);

        Triangle triangle = new Triangle();
        printer.printShapeInfo(triangle);

        Ellipse ellipse = new Ellipse();
        printer.printShapeInfo(ellipse);

        Line line = new Line();
        printer.printShapeInfo(line);
    }
}