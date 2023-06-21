package models;

//Sottoclasse Moto
public class Motorcycle extends Vehicle {
    public Motorcycle(int speed) {
        this.speed = speed;
    }

    public int getNumberOfTires() {
        return 2; // le moto hanno 2 ruote
    }
}
