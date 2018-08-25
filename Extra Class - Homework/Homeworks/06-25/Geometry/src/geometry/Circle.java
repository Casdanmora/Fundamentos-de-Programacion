package Geometry;

import java.util.Scanner;

public class Circle {

    private double radius;
    private double result;

    Circle() {
    }

    private void askRadius() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        this.radius = Integer.parseInt(reader.nextLine());
    }

    public double calcPerimeter() {

        askRadius();
        this.result = (2 * Math.PI * radius);
        System.out.println("The perimeter of the circle is: " + this.result);
        return this.result;
    }

    public double calcArea() {

        askRadius();
        this.result = Math.PI * (radius * radius);
        System.out.println("The area is: " + this.result);
        return this.result;
    }
}