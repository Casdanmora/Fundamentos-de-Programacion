package Geometry;

import java.util.Scanner;

public class Rectangle {

    private double length;
    private double result;
    private double width;

    public Rectangle() {
    }

    public void askLength() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the length: ");
        this.length = Integer.parseInt(reader.nextLine());
    }

    public void askWidth() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the width: ");
        this.width = Integer.parseInt(reader.nextLine());
    }

    public double calcPerimeter() {
        askLength();
        askWidth();
        this.result = (length * 2) + (width * 2);
        System.out.println("The perimeter of the rectangle is: " + this.result);
        return this.result;
    }

    public double calcArea() {
        askLength();
        askWidth();
        this.result = (length * width);
        System.out.println("The area is: " + this.result);
        return this.result;
    }
}