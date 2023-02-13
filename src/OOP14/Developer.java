package OOP14;

public class Developer extends Firma{
    //OOP15 - Kreirati klasu Firma koja ce imati atribute naziv pozicije i pocetna plata
//Kreirati klasu developer koja ce naslediti klasu Firma i imati atribute trenutna plata i programski jezik
//Kreirati klasu QA koja ce naslediti klasu Firma i imati atribute boolean automatsko testiranje i godine iskustva
//Kreirati klasu Mentee koja ce naslediti klasu QA i imati atribute

    int trenutnaPlata;
    String programskiJezik;

    public Developer(String nazivPozicije, int pocetnaPlata, int trenutnaPlata, String programskiJezik) {
        super(nazivPozicije, pocetnaPlata);
        this.trenutnaPlata = trenutnaPlata;
        this.programskiJezik = programskiJezik;
    }
    public void stampa(){
        System.out.println(this.nazivPozicije + " je imao pocetnu platu od " + this.pocetnaPlata + " dinara");
        System.out.println("Sada koristi " + this.programskiJezik + " i ima platu od " + this.trenutnaPlata);
    }
}
