package OOP15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//OOP16 - Kreirati klasu IT koja ce imati atribute pocetna plata i godine u firmi
//Kreirati klasu QA koja ce naslediti klasu IT i imati atribute listu programskih jezika
//Ako je zaposlen u firmi duze od 3 godine
//onda ima povecanje od 20%, a ako je duze od 5 godina onda ima povecanje od 50%
//Ako u listi programskih jezika ima javu onda dobija godisnje bonus 3% od godisnje plate
//Kreirati klasu Mentor koja ce naslediti klasu QA i ima atribut koliko njima je zaposleni mentor
//Za svakog kome je mentor ima po 1% vise bonusa godisnje plate
//Odstampati razliku u plati u evrima i koliki je godisnji bonus u evrima
        IT it1 = new IT(10000, 4);

        ArrayList<String> programskiJezik = new ArrayList<>();
        programskiJezik.add("java");
        QA qa1 = new QA(it1.pocetnaPlata, 4, programskiJezik);
      // qa1.povecanjeProvera();

        programskiJezik = new ArrayList<>();
        programskiJezik.add("python");
        QA qa2 = new QA(it1.pocetnaPlata, 6, programskiJezik);
     //   qa2.proveraJezika();

        programskiJezik = new ArrayList<>();
        programskiJezik.add("java");
        Mentor m1 = new Mentor(qa2.pocetnaPlata, 5, programskiJezik, 5);
       m1.povecanjeProvera();
       // m1.proveraJezika();
        m1.stampa();




    }
}
