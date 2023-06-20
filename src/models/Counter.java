package models;

public class Counter {
    static int count;
    int number;

    public Counter(int number) {
        this.number = number;
    }

    public static void incrementCount(Counter counter) {
        count += counter.getNumber();
    }

    public static int getCount() {
        return count;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}