package OOP15_cas;

public class Developer extends Firma{

        int trenutnaPlata;
        String programskiJezik;

        public Developer(String nazivPozicije, int pocetnaPlata, int trenutnaPlata, String programskiJezik) {
            super(nazivPozicije, pocetnaPlata);
            this.trenutnaPlata = trenutnaPlata;
            this.programskiJezik = programskiJezik;
        }

        public void stampa() {
            System.out.println("Developer ima trenutnu platu " + this.trenutnaPlata + " sto je za " + (this.trenutnaPlata - this.pocetnaPlata)
                    + " vise od pocetka rada jer zna " + this.programskiJezik);
        }
    }
