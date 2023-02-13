package OOP11;

public class Rucak {
    //OOP11 Kreirati klasu "Rucak" koja ce imati sve private atribute. Oni su nazivSastojka, cena i gramaza.
    // U istoj klasi kreirati metodu za stampanje, a u Main klasi kreirati objekte koji su potrebni za spremanje rucka.

    private String nazivSastojka;
    private int cena;
    private int gramaza;


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

    public Rucak(){

    }
    public void stampa(){
        System.out.println(getNazivSastojka() + " od " + getGramaza() + " grama kosta " + getCena() + " dinara.");
    }
}




