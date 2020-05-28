package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        System.out.println("Welcome to the Racing Game!");


        Car carReference = new Car();
        carReference.make = "audi";
        carReference.model = "a4";
        carReference.mileage = 7.5;
        carReference.fuelLevel = 60;
        carReference.color = "red";
        carReference.maxSpeed = 300;

        carReference.engine = new Engine();
        carReference.engine.manufacturer= "vw";
        carReference.engine.capacity= 1900;


        System.out.println(carReference.make);
        System.out.println(carReference.model);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.color);
        System.out.println(carReference.maxSpeed);


        System.out.println(carReference.totalTraveledDistance);
        System.out.println(carReference.damaged);
        System.out.println(carReference.doorCount);
        Car car2 = new Car();
        car2.make = "Mercedes";
        car2.model = "cls";
        car2.color = "black";
//concatenation
        System.out.println(car2.make + "" + carReference.make);

        car2 = carReference;
        System.out.println(car2.make);
        System.out.println(carReference.make);
    }
}
