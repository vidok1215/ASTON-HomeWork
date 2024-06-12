package Lesson7.geometricShapes;

public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        // Using Heron's formula to calculate area of triangle
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void displayInfo() {
        System.out.println("Triangle - Perimeter: " + calculatePerimeter() + ", Area: " + calculateArea() +
                ", Fill Color: " + fillColor + ", Border Color: " + borderColor);
    }
}