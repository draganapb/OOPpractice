package OOP14_cas;

public class Telefon extends Proizvod{

        String marka;
        String model;
        int cena;

        public Telefon(String nazivKategorije, int IDKategorije, String marka, String model, int cena) {
            super(nazivKategorije, IDKategorije);
            this.marka = marka;
            this.model = model;
            this.cena = cena;
        }

        public void stampa() {
            System.out.println("Proizvod kategorije " + this.nazivKategorije + " ima ID: " + this.IDKategorije);
            System.out.println("Telefon " + this.marka + " " + this.model + " kosta " + this.cena + " evra.");
        }
    }
