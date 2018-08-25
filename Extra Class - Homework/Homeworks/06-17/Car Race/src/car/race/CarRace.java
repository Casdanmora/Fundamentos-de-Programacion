/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.race;

/**
 *
 * @author casdan
 */
public class CarRace {

    public static void main(String[] args) {
        Car firstCar = new Car ("Meeerc", 2005, 190);
        Car secondCar = new Car("Jaaaag", 2018, 175);
        Car thirdCar = new Car("Beemer", 2016, 165);
        
        firstCar.printInfo();
        firstCar.move();
        
        secondCar.printInfo();
        secondCar.move();
        
        thirdCar.printInfo();
        thirdCar.move();

        if (firstCar.counter() < secondCar.counter() && firstCar.counter() < thirdCar.counter()) {
            firstCar.printWinner();
        } else if (secondCar.counter() < firstCar.counter() && secondCar.counter() < thirdCar.counter()) {
            secondCar.printWinner();
        } else {
            thirdCar.printWinner();
        }
    }
}