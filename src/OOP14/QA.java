package OOP14;

public class QA extends Firma{
    //OOP15 - Kreirati klasu Firma koja ce imati atribute naziv pozicije i pocetna plata
//Kreirati klasu developer koja ce naslediti klasu Firma i imati atribute trenutna plata i programski jezik
//Kreirati klasu QA koja ce naslediti klasu Firma i imati atribute boolean automatsko testiranje i godine iskustva
//Kreirati klasu Mentee koja ce naslediti klasu QA i imati atribute

    boolean automatskoTestiranje;
    int godIskustva;

    public QA(String nazivPozicije, int pocetnaPlata, boolean automatskoTestiranje, int godIskustva) {
        super(nazivPozicije, pocetnaPlata);
        this.automatskoTestiranje = automatskoTestiranje;
        this.godIskustva = godIskustva;
    }
    public void stampa(){
            System.out.println(this.nazivPozicije + " je imao pocetnu platu " + this.pocetnaPlata);
            System.out.println("Sada ima " + this.godIskustva + " godine iskustva ");
            if(automatskoTestiranje){
                System.out.println("i obucen je za automatsko testiranje");
            }
            else{
                System.out.println("I nije obucen za automatsko testiranje");
            }



    }
}
