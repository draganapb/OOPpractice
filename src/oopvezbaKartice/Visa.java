package oopvezbaKartice;

public class Visa extends Platna{
  /*  Napraviti klasu Visa kartica koja nasledjuje klasu Platna kartica
    Napraviti atribut ime i prezime za klasu
    Geter i seter za atribut
    Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.8%
    Najmanja provizija je 4$
    Implementirati metodu koja stampa karticu u formatu:
    Visa card: 7105-1579-5191-6184, 11/2024, $212 Ime i Prezime*/
    private String imePrezime;

    public Visa(double suma, String brojKartice, int mesec, int godina, String imePrezime) {
        super(suma, brojKartice, mesec, godina);
        this.imePrezime = imePrezime;
    }
    public void transakcija(double novac){
        double provizija = novac * 0.018;
        if(provizija<4){
            super.izvrsiTransakciju(novac + 4);
        }
        else{
            super.izvrsiTransakciju(novac + provizija);

        }
    }
    public void stampa(){
        System.out.println("Visa kartica: ") ;
         super.stampa();
        System.out.println("" + this.imePrezime);
    }
}
