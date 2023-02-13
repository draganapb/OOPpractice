package OOP14_cas;

public class Televizor extends Proizvod{

        int dijagonala;
        String rezolucija;

        public Televizor(String nazivKategorije, int IDKategorije, int dijagonala, String rezolucija) {
            super(nazivKategorije, IDKategorije);
            this.dijagonala = dijagonala;
            this.rezolucija = rezolucija;
        }

        public void stampa() {
            System.out.println("Proizvod kategorije " + this.nazivKategorije + " ima ID: " + this.IDKategorije);
            System.out.println("Televizor ima dijagonalu " + this.dijagonala + " inca sa " + this.rezolucija + " rezolucijom.");
        }
    }

