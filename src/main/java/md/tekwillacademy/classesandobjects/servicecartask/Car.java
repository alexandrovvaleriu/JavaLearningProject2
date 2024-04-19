package md.tekwillacademy.classesandobjects.servicecartask;

public class Car {
    String make;

    String color;

    int numberOfDoor;

    int motorCapacity;


    public Car (String make, String color, int numberOfDoor, int motorCapacity){
        System.out.println("This is a full constructor");
        this.make = make;
        this.color = color;
        this.numberOfDoor = numberOfDoor;
        this.motorCapacity = motorCapacity;
        System.out.println("The object is created");
    }
}
