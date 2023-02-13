package OOP8;

public class Serija {
    //OOP8 - Kreirati klasu Serija koja ce imati naziv, broj sezona i trajanje svake epizode
//U main metodi kreirati tri objekta koristeci pun konstruktor
//U klasi Serija napraviti i metodu za stampanje


    String naziv;
    int brojSezona;
    int trajanje;

    public Serija(String naziv, int brojSezona, int trajanje) {
        this.naziv = naziv;
        this.brojSezona = brojSezona;
        this.trajanje = trajanje;
    }

    public void stampanje(){
        System.out.println("Serija " + this.naziv + " ima " + this.brojSezona + " sezona i traje " + this.trajanje + " minuta" );
    }
}
