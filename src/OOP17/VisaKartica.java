package OOP17;

public class VisaKartica extends PlatnaKartica{
    /* Napraviti klasu Visa kartica koja nasledjuje klasu Platna kartica
    Napraviti atribut ime i prezime za klasu
    Geter i seter za atribut
    Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.8%
    Najmanja provizija je 4$
    Implementirati metodu koja stampa karticu u formatu:
    Visa card: 7105-1579-5191-6184, 11/2024, $212 Ime i Prezime   */
    String imePrezime;


    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public VisaKartica(double suma, String brojKartice, int mesec, int godina, String imePrezime) {
        super(suma, brojKartice, mesec, godina);
        this.imePrezime = imePrezime;
    }

    public void transakcijaProvizija (double x){
        double provizija = x*(1.8/100);
        if(provizija < 4){
            double y = super.izvrsiTransakciju(x);
            System.out.println("Izvrsena je transakcija od $" + x + ", stanje na racunu je $" + y);

        }
        else{
            double y = (super.izvrsiTransakciju(x)-provizija);
            System.out.println("Izvrsena je transakcija od $" + x + ", stanje na racunu je $" + y);
        }


    }
    public void stampa(){

       System.out.println("Visa card: " + this.brojKartice + ", " + this.mesec + "/" + this.godina + " $" + this.suma + " "+  this.imePrezime);
    }

}
