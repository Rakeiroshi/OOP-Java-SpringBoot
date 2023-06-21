package models;

//Creo una classe abstract
abstract class Vehicle {
    protected int speed;

    public int getSpeed() {
        return speed;
    }

    public abstract int getNumberOfTires();
}