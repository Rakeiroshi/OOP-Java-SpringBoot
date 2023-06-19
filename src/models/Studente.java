package models;

public class Studente {
    String nome;
    String cognome;
    int eta;
    int media;
    int esami_mancanti;
    Boolean italiano;

    public Studente(String nome, String cognome, int eta, int media, int esami_mancanti, Boolean italiano) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.media = media;
        this.esami_mancanti = esami_mancanti;
        this.italiano = italiano;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", media=" + media +
                ", esami_mancanti=" + esami_mancanti +
                ", italiano=" + italiano +
                '}';
    }

    public void ammesso() {
        System.out.println(this.getNome() + ":");
        if (this.esami_mancanti <= 0 && this.media >= 18) {
            System.out.println("Studente ammesso alla prova finale");
        } else {
            System.out.println("Studente non ammesso alla prova finale");
        }
    }
}
