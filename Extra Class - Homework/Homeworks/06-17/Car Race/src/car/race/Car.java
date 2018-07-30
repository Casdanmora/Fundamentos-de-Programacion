package car.race;

import java.util.Random;

public class Car {

    private String brand;
    private int year;
    private int horsePower;
    private int random;
    private int counter;

    public Car(String brand, int year, int horsePower) {
        this.brand = brand;
        this.year = year;
        this.horsePower = horsePower;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand + " Year: " + year + " HorsePower: " + horsePower);
    }

    public void move() {
        Random rand = new Random();
        int advancedMeters = 0;
        this.counter = 0;
        int progress = 0;

        while (progress < 1000) {
            this.random = 0 + rand.nextInt((1 - 0) + 1);
            advancedMeters = this.random * this.horsePower;
            progress += advancedMeters;
            this.counter++;
            //System.out.println(this.brand + progress);
            if (progress >= 1000) {
                break;
            }
        }
    }

    public int counter() {
        return this.counter;
    }

    public void printWinner() {
        System.out.println("First car to pass 1000m: " + this.brand + ".");
    }
}