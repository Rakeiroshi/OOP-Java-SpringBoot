package models;

//Sottoclasse Car
public class Car extends Vehicle {
    public Car(int speed) {
        this.speed = speed;
    }

    public int getNumberOfTires() {
        return 4; // le auto hanno 4 ruote
    }
}