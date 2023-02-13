package OOP19_cas;

public class Main {
    public static void main(String[] args) {

        /* OOP19



Napraviti klasu Master kartica koja nasledjuje klasu Platna kartica
Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.5%
Napraviti metodu odrzavanja racuna koja je 2$
Implementirati metodu koja stampa karticu u formatu:
Master card: 7105-1579-5191-6184, 11/2024, $212

     */

                MasterKartica m1 = new MasterKartica(100, "1234-5678-2234-5678", 11,2024);
                m1.stampa();
                m1.odrzavanjeRacuna();
                m1.stampa();
                m1.izvrsiTransakciju(50);
                m1.stampa();
                m1.dodajSredstva(100);
                m1.stampa();

                VisaKartica v1 = new VisaKartica(100, "1234-2567-3632-3556", 1, 2023, "Dragoljub Boranijasevic");
                v1.stampa();
                v1.dodajSredstva(250);
                v1.stampa();
                v1.izvrsiTransakciju(50);
                v1.stampa();
                v1.izvrsiTransakciju(250);
                v1.stampa();


            }
        }
