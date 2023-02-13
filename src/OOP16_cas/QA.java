package OOP16_cas;

import java.util.ArrayList;

public class QA extends IT{
    //OOP16 - Kreirati klasu IT koja ce imati atribute pocetna plata i godine u firmi
//Kreirati klasu QA koja ce naslediti klasu IT i imati atribute listu programskih jezika
//Ako je zaposlen u firmi duze od 3 godine
//onda ima povecanje od 20%, a ako je duze od 5 godina onda ima povecanje od 50%
//Ako u listi programskih jezika ima javu onda dobija godisnje bonus 3% od godisnje plate
//Kreirati klasu Mentor koja ce naslediti klasu QA i ima atribut koliko njima je zaposleni mentor
//Za svakog kome je mentor ima po 1% vise bonusa godisnje plate
//Odstampati razliku u plati u evrima i koliki je godisnji bonus u evrima


        ArrayList<String> programskiJezici;

        public QA(int pocetnaPlata, int godine) {
            super(pocetnaPlata, godine);
            this.programskiJezici = new ArrayList<>();
        }

        public double plata() {
            double trenutnaPlata = pocetnaPlata;
            if (godine>5) {
                trenutnaPlata = pocetnaPlata * 1.5;
            } else if (godine>3) {
                trenutnaPlata = pocetnaPlata * 1.2;
            }
            return trenutnaPlata;
        }

        public double racunanjeBonusa() {
            double godisnjaPlata = plata() * 12;
            for (int i = 0; i < programskiJezici.size(); i++) {
                if (programskiJezici.get(i).equals("Java")) {
                    return godisnjaPlata*1.03;
                }
            }
            return godisnjaPlata*1;
        }

        public double bonus() {
            double godisnjaPlata = plata() * 12;
            return racunanjeBonusa() - godisnjaPlata;
        }

        public void stampa() {
            System.out.println("Razlika u plati je " + (plata()-pocetnaPlata) + " evra.");
            if (bonus()>0) {
                System.out.println("Zaposleni ima bonus " + bonus() + " evra.");
            } else {
                System.out.println("Zaposleni nema bonus.");
            }
            System.out.println("------------");
        }

    }

