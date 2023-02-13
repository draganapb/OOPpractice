package OOP14;

public class Firma {
    //OOP15 - Kreirati klasu Firma koja ce imati atribute naziv pozicije i pocetna plata
//Kreirati klasu developer koja ce naslediti klasu Firma i imati atribute trenutna plata i programski jezik
//Kreirati klasu QA koja ce naslediti klasu Firma i imati atribute boolean automatsko testiranje i godine iskustva
//Kreirati klasu Mentee koja ce naslediti klasu QA i imati atribute

    String nazivPozicije;
    int pocetnaPlata;

    public Firma(String nazivPozicije, int pocetnaPlata) {
        this.nazivPozicije = nazivPozicije;
        this.pocetnaPlata = pocetnaPlata;
    }
    public void stampa(){
        System.out.println(this.nazivPozicije + " ima pocetnu platu platu " + this.pocetnaPlata + " dinara");
    }
}
