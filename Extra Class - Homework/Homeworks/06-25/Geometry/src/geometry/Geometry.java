package Geometry;

import geometry.Menu;
import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Menu menu = new Menu();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Pentagon pentagon = new Pentagon();

        while (true) {
            menu.perimeterOrArea();
            int input = Integer.parseInt(reader.nextLine());

            if (input == 1) {
                menu.shapes();
                input = Integer.parseInt(reader.nextLine());
                if (input == 1) {
                    circle.calcPerimeter();
                } else if (input == 2) {
                    triangle.calcPerimeter();
                } else if (input == 3) {
                    square.calcPerimeter();
                } else if (input == 4) {
                    rectangle.calcPerimeter();
                } else if (input == 5) {
                    pentagon.calcPerimeter();

                } else if (input == 2) {
                    menu.shapes();
                    input = Integer.parseInt(reader.nextLine());
                    if (input == 1) {
                        circle.calcArea();
                    } else if (input == 2) {
                        triangle.calcArea();
                    } else if (input == 3) {
                        square.calcArea();
                    } else if (input == 4) {
                        rectangle.calcArea();
                    } else if (input == 5) {
                        pentagon.calcArea();
                    }

                } else if (input == 3) {
                    menu.exit();
                    break;
                }
            }
        }
    }
}
