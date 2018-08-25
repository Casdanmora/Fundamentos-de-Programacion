package Geometry;

import java.util.Scanner;

public class Square {

    private int length;
    private int result;

    public Square() {
    }

    public void askLength() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the length: ");
        this.length = Integer.parseInt(reader.nextLine());
    }

    public int calcPerimeter() {
        askLength();
        this.result = length * 4;
        System.out.println("The perimeter is: " + this.result);
        return this.result;
    }

    public int calcArea() {
        askLength();
        this.result = (length * length);
        System.out.println("The area of the square is: " + this.result);
        return this.result;
    }
}