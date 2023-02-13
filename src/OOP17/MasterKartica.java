package OOP17;

public class MasterKartica extends PlatnaKartica{
    /*Napraviti klasu Master kartica koja nasledjuje klasu Platna kartica
    Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.5%
    Napraviti metodu odrzavanja racuna koja je 2$
    Implementirati metodu koja stampa karticu u formatu:
    Master card: 7105-1579-5191-6184, 11/2024, $212*/

    public MasterKartica(double suma, String brojKartice, int mesec, int godina) {
        super(suma, brojKartice, mesec, godina);

    }

    public void transakcijaProvizija(double x){
    double provizija = (1.5/100)*x;
    double y = izvrsiTransakciju(x)-provizija;
        System.out.println("Izvrsena je transakcija od $" + x + ", stanje na racunu je $" + y);
    }
    public void odrzavanjeRacuna(){
        System.out.println("suma pre naplate odrzavanja racuna je " + this.suma);
        this.suma =this.suma-2;
        System.out.println(",a nakon" + this.suma);

    }
    public void stampa(){
            super.stampa();
    }
}
