package OOP15_cas;

public class Main {
    public static void main(String[] args) {


//OOP15 - Kreirati klasu Firma koja ce imati atribute naziv pozicije i pocetna plata
//Kreirati klasu developer koja ce naslediti klasu Firma i imati atribute trenutna plata i programski jezik
//Kreirati klasu QA koja ce naslediti klasu Firma i imati atribute boolean automatsko testiranje i godine iskustva
//Kreirati klasu Mentee koja ce naslediti klasu QA i imati atribute ime mentora

                Firma qa = new Firma("QA", 1000);
                Firma dev = new Firma("Developer", 1100);

                QA qa1 = new QA(qa.nazivPozicije, qa.pocetnaPlata, true, 3);
                Developer dev1 = new Developer(dev.nazivPozicije, dev.pocetnaPlata, 1500, "C++");
                Mentee m1 = new Mentee(qa1.nazivPozicije,qa1.pocetnaPlata, false ,1,"Marko Tomin");

                dev1.stampa();
                qa1.stampa();
                m1.stampa();

            }
        }

