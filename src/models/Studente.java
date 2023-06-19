package models;
import java.util.ArrayList;
import java.util.List;

public class Studente {
    String nome;
    List<Integer> grades = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public Studente(String nome) {
        this.nome = nome;
    }

    public void addGrade(int voto){
        grades.add(voto);
    }

    public double getAverageGrade(){
        int somma = 0;
        int num_voti = 0;

        for( double i: grades) {
            somma += i;
            num_voti++;
        }
        return (double) somma / num_voti;
        }
}
