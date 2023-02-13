package OOP11;

public class Main {
    public static void main(String[] args) {
        //OOP11 Kreirati klasu "Rucak" koja ce imati sve private atribute. Oni su nazivSastojka, cena i gramaza.
        // U istoj klasi kreirati metodu za stampanje, a u Main klasi kreirati objekte koji su potrebni za spremanje rucka.

        Rucak rucak1 = new Rucak();
        rucak1.setNazivSastojka("krompir");
        rucak1.setGramaza(300);
        rucak1.setCena(350);

        Rucak rucak2 = new Rucak();
        rucak2.setNazivSastojka("luk");
        rucak2.setGramaza(500);
        rucak2.setCena(300);

        Rucak rucak3 = new Rucak();
        rucak3.setNazivSastojka("piletina");
        rucak3.setCena(550);
        rucak3.setGramaza(300);

        Rucak rucak4 = new Rucak();
        rucak4.setNazivSastojka("pavlaka za kuvanje");
        rucak4.setGramaza(500);
        rucak4.setCena(360);

        rucak1.stampa();
        rucak2.stampa();
        rucak3.stampa();
        rucak4.stampa();



    }

}
