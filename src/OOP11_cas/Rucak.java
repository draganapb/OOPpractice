package OOP11_cas;

public class Rucak {

        private String nazivSastojka;
        private int cena;
        private int gramaza;

        public Rucak() {
            //Program moze da radi i bez ovog konstruktora jer java sama kreira prazan konstruktor
            //Za pocetak se savetuje da kreirate i prazne konstruktore da imate svest da oni postoje
            //iako ih nekada ne vidimo u klasi
        }

        public String getNazivSastojka() {
            return nazivSastojka;
        }

        public void setNazivSastojka(String nazivSastojka) {
            this.nazivSastojka = nazivSastojka;
        }

        public int getCena() {
            return cena;
        }

        public void setCena(int cena) {
            this.cena = cena;
        }

        public int getGramaza() {
            return gramaza;
        }

        public void setGramaza(int gramaza) {
            this.gramaza = gramaza;
        }

        public void stampa() {
            System.out.println("Sastojak " + getNazivSastojka() + " ima " + getGramaza() + " grama i kosta "
                    + getCena() + " dinara.");
        }
    }
