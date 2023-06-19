import models.Studente;

public class Main {
    public static void main(String[] args) {

        Studente michael = new Studente(
                "Michael",
                "Schumacher",
                20,
                30,
                0,
                false
        );

        Studente ayrton = new Studente(
                "Ayrton",
                "Senna",
                22,
                28,
                0,
                false
        );

        Studente jarno = new Studente(
                "Jarno",
                "Trulli",
                24,
                25,
                2,
                true
        );
        Studente giancarlo = new Studente(
                "Giancarlo",
                "Fisichella",
                22,
                17,
                0,
                true
        );
        Studente max = new Studente(
                "Max",
                "Verstappen",
                19,
                29,
                5,
                false

        );

        michael.ammesso();
        ayrton.ammesso();
        jarno.ammesso();
        giancarlo.ammesso();
        max.ammesso();

    }
}