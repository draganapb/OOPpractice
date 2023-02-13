package OOP14;

public class Mentee extends QA {
    //OOP15 - Kreirati klasu Firma koja ce imati atribute naziv pozicije i pocetna plata
//Kreirati klasu developer koja ce naslediti klasu Firma i imati atribute trenutna plata i programski jezik
//Kreirati klasu QA koja ce naslediti klasu Firma i imati atribute boolean automatsko testiranje i godine iskustva
//Kreirati klasu Mentee koja ce naslediti klasu QA i imati atribute ime mentora
    String mentor;

    public Mentee(String nazivPozicije, int pocetnaPlata, boolean automatskoTestiranje, int godIskustva, String mentor) {
        super(nazivPozicije, pocetnaPlata, automatskoTestiranje, godIskustva);
        this.mentor = mentor;
    }
    public void stampa(){
        System.out.println(this.mentor + " ima " + this.godIskustva + " i mentor je za poziciju " + this.nazivPozicije);
        if(automatskoTestiranje){
            System.out.println();
        }
    }
}
