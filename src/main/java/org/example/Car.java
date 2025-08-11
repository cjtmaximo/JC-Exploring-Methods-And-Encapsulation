package org.example;

public class Car {
    // Exercise 1. Designing Methods
    public void startEngine() {
        System.out.println("Engine has started.");
    }

    public String drive(int speed){
        return "The car is moving at " + speed + " mph.";
    }

    public void turnOffEngine() {
        System.out.println("Engine has been turned off.");
    }

    public static void main(String[] args) {
        /*
        * Output prediction:
        * Engine has started.
        * The car is moving at 60 mph.
        * */
        Car myCar = new Car();
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);
        myCar.turnOffEngine(); // Mini-Challenge: Should output "Engine has been turned off."
    }
}