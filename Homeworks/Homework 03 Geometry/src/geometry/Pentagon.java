package Geometry;

import java.util.Scanner;

public class Pentagon {

    private int length;
    private int result;

    public Pentagon() {
    }

    public void askLength() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the length: ");
        this.length = Integer.parseInt(reader.nextLine());
    }

    public int calcPerimeter() {
        askLength();
        this.result = length * 5;
        System.out.println("The perimeter of the pentagon is: " + this.result);
        return this.result;
    }

    public int calcArea() {
        askLength();
        this.result = (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(lenght, 2);
        System.out.println("The area is: " + this.result);
        return this.result;
    }
}
