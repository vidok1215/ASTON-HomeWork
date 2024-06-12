package Lesson7.geometricShapes;

public class Rectangle implements Shape {
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public void displayInfo() {
        System.out.println("Rectangle - Perimeter: " + calculatePerimeter() + ", Area: " + calculateArea() +
                ", Fill Color: " + fillColor + ", Border Color: " + borderColor);
    }
}
