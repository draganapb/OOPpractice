package OOP11_cas;

public class Main {
    public static void main(String[] args) {

                Rucak r1 = new Rucak();
                r1.setNazivSastojka("kore");
                r1.setCena(150);
                r1.setGramaza(120);
                r1.stampa();

                //Mogu da koristim isti objekat da pregazim prethodne podatke i da kreiram objekat sa novim podacima
                //Ali je pametnije praviti svaki objekat za sebe jer pregazeni podaci na kraju budu zaboravljeni
                //Ako bi nam na kraju trebalo da saberemo sve cene onda necemo moci da uradimo ako imamo jedan objekat

        /*r1.setGramaza(300);
        r1.setCena(500);
        r1.setNazivSastojka("kackavalj");
        r1.stampa();*/

                Rucak r2 = new Rucak();
                r2.setNazivSastojka("kackavalj");
                r2.setCena(500);
                r2.setGramaza(300);
                r2.stampa();

            }
        }
