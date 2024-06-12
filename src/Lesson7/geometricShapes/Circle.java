package Lesson7.geometricShapes;

public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void displayInfo() {
        System.out.println("Circle - Perimeter: " + calculatePerimeter() + ", Area: " + calculateArea() +
                ", Fill Color: " + fillColor + ", Border Color: " + borderColor);
    }
}