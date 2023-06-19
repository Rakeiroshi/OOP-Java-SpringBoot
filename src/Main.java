import models.Bancomat;

public class Main {

    public static void main(String[] args) {

        Bancomat antonino = new Bancomat(
                "Antonino",
                "Canavacciuolo",
                4026111122223333L,
                2,
                500.41,
                true
        );
        Bancomat bruno = new Bancomat(
                "Bruno",
                "Barbieri",
                4026555566667777L,
                5,
                150.10,
                false
        );
        Bancomat alessandro = new Bancomat(
                "Alessandro",
                "Di Paolo",
                4026999966669999L,
                0,
                800.10,
                true
        );
        antonino.pin();
        System.out.println("Saldo attuale: \n" + antonino);
        antonino.preleva_100();
        System.out.println("Prelievo effettuato: - 100 €\n" + antonino);
        System.out.println("*********************************");
        bruno.pin();
        System.out.println("*********************************");
        alessandro.pin();
        System.out.println("Saldo attuale: \n" + alessandro);
        alessandro.deposita_100();
        System.out.println("Deposito effettuato: + 100 €\n" + alessandro);
        System.out.println("*********************************");
    }
}