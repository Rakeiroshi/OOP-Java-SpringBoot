import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> warcraft = new ArrayList<String>();
        warcraft.add("Vol'Jin");
        warcraft.add("Jaina");
        warcraft.add("Mrllgrll");
        warcraft.add("Arthas");
        warcraft.add(2, "Alamorte");
        warcraft.add(0, "Thrall");

        List<String> horde = new ArrayList<String>();
        horde.add("Kikkamolo");
        horde.add("Sylvanas");
        horde.add("Garrosh");

        List<String> forthehorde = new ArrayList<String>();
        forthehorde.addAll(horde); //aggiunge la lista
        forthehorde.add("Baine"); //aggiunge un elemento alla lista
        forthehorde.add(warcraft.get(1)); //estrae un elemento dalla lista
        forthehorde.set(0, "Kilokahn");
        forthehorde.remove("Sylvanas"); //rimuove un elemento dalla lista
        //forthehorde.remove(0);
        //forthehorde.clear(); svuota tutta la lista



        System.out.println("WOW Characters");
        System.out.println(warcraft);
        System.out.println("WOW Characters Horde");
        System.out.println(horde);
        System.out.println("all Characters Horde");
        System.out.println(forthehorde);
        System.out.println("esiste?");
        System.out.println(horde.contains("baraka")); //stampa se esiste o meno
        System.out.println(horde.indexOf("Garrosh")); //stampa la posizione dell'elemento
        System.out.println(horde.indexOf("baraka")); ////stampa la posizione dell'elemento (se non esiste è restituisce -1)
        System.out.println("set-size");
        horde.set(horde.size()-1, "bubu"); //stampa il numero di elementi della lista
        System.out.println(horde);
        System.out.println(horde.isEmpty()); // dice se la lista è vuota o meno
        System.out.println("WOW SubCharacters");
        System.out.println(warcraft.subList(0, 3));//stampa una parte della lista (in questo caso 0 1 e 2)

        System.out.println("\nWOW Characters Loop ");
        for (String WOW: warcraft) {
            System.out.println(WOW);
        }

        System.out.println("\nWOW horde Loop ");
        for (String redflag: horde) {
            System.out.println(redflag);
        }
    }
}