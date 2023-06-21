import models.Car;
public class Main {
    public static void main(String[] args) {
        Car auto = new Car(
                "Enzo",
                "Ferrari",
                2002
        );
        System.out.println(auto.model); //Errore: model ha un accesso privato
        System.out.println(auto.manufacturer); //Errore manufacturer è protetto
        System.out.println(auto.year); //2002
}
    class Car {
        private String model;
        protected String manufacturer;
        public int year;

        public Car(String model, String manufacturer, int year) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.year = year;
        }
}