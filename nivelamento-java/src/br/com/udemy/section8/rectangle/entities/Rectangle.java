package br.com.udemy.section8.rectangle.entities;

public class Rectangle {

    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * width + 2 * height;
    }

    public String toString() {
        return "AREA: "
                + String.format("%.2f", area())
                + ", "
                + "PERIMETER: "
                + String.format("%.2f", perimeter());
    }
}
