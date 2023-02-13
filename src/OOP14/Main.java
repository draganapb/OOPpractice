package OOP14;

public class Main {
    //OOP15 - Kreirati klasu Firma koja ce imati atribute naziv pozicije i pocetna plata
//Kreirati klasu developer koja ce naslediti klasu Firma i imati atribute trenutna plata i programski jezik
//Kreirati klasu QA koja ce naslediti klasu Firma i imati atribute boolean automatsko testiranje i godine iskustva
//Kreirati klasu Mentee koja ce naslediti klasu QA i imati atribute
    public static void main(String[] args) {
        Firma pozicija = new Firma("developer", 85000);
        pozicija.stampa();

        Developer dev1 = new Developer(pozicija.nazivPozicije, pozicija.pocetnaPlata, 200000, "Java");
        dev1.stampa();

        QA qa1 = new QA("QA tester", pozicija.pocetnaPlata, true, 4);
        qa1.stampa();

        Mentee mentor1 = new Mentee(qa1.nazivPozicije, pozicija.pocetnaPlata, true, 6, "Milan Peric");


    }
}
