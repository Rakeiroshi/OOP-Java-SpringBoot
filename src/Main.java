import models.Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter(10);

        System.out.println("***************************************************");
        System.out.println("Inizio conteggio 1: " + Counter.getCount());
        System.out.println("Inizio conteggio 2: " + Counter.getCount());

        System.out.println("***************************************************");
        Counter.incrementCount(counter1);
        System.out.println("Primo conteggio dopo l'incremento: " + Counter.getCount());

        Counter.incrementCount(counter2);
        System.out.println("Secondo conteggio dopo l'incremento: " + Counter.getCount());

        System.out.println("***************************************************");
        counter1.setNumber(3);
        Counter.incrementCount(counter1);
        System.out.println("Primo conteggio dopo aver settato il numero di incremento " + Counter.getCount());

        counter2.setNumber(10);
        Counter.incrementCount(counter2);
        System.out.println("Secondo conteggio dopo aver settato il numero di incremento " + Counter.getCount());

        System.out.println("***************************************************");
        System.out.println("Conteggio corrente 1: " + counter1.getNumber());
        System.out.println("Conteggio corrente 2: " + counter2.getNumber());
    }
}
