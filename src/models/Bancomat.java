package models;

public class Bancomat {
    String nome;
    String cognome;
    long numero_carta;
    int conteggio_pin;
    double saldo;
    Boolean stampa_ricevuta;

    public Bancomat(String nome, String cognome, long numero_carta, int conteggio_pin, double saldo, Boolean stampa_ricevuta) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero_carta = numero_carta;
        this.conteggio_pin = conteggio_pin;
        this.saldo = saldo;
        this.stampa_ricevuta = stampa_ricevuta;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Bancomat{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", numero_carta=" + numero_carta +
                ", conteggio_pin=" + conteggio_pin +
                ", saldo=" + saldo +
                ", stampa_ricevuta=" + stampa_ricevuta +
                '}';
    }

    public void pin() {
        System.out.println(this.getNome() + ":");
        if (this.conteggio_pin <= 3) {
            System.out.println("Pin corretto Benvenuto");

        } else {
            System.out.println("Troppi tentativi falliti carta bloccata");
        }
    }
    public double deposita_100(){

        return this.saldo = this.saldo + 100.00;

    }
    public double preleva_100(){

        return this.saldo = this.saldo - 100.00;

    }
}
