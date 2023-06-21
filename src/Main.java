import models.Car;
import models.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car(
                318);
        Motorcycle vespa = new Motorcycle(
                45);

        System.out.println("La velocità massima della Ferrari SF23: " + ferrari.getSpeed() + "km/h");
        System.out.println("Numero di ruote: " + ferrari.getNumberOfTires());
        System.out.println("*******************************************************");
        System.out.println("La velocità della vespa 50 (non truccata): " + vespa.getSpeed() + "km/h");
        System.out.println("Numero di ruote: " + vespa.getNumberOfTires());
    }
}
