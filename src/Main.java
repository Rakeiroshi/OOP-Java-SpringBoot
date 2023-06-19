import models.Studente;

public class Main {
    public static void main(String[] args) {

        Studente mia = new Studente("Mia");
        mia.addGrade(29);
        mia.addGrade(29);
        mia.addGrade(28);
        System.out.println("La studentessa " + mia.getNome() + " ha una media di: " + mia.getAverageGrade());

        Studente eva = new Studente("Eva");
        eva.addGrade(25);
        eva.addGrade(30);
        eva.addGrade(22);
        System.out.println("La studentessa " + eva.getNome() + " ha una media di: " + eva.getAverageGrade());
    }

}