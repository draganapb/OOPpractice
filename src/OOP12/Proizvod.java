package OOP12;

public class Proizvod {
    //OOP12 - Kreirati klasu Proizvod koja ce imati svoj naziv i ID koji ce biti u konstruktoru
//Zatim kreirati private atribute cena i popust (boolean)
//U Main metodi kreirati objekte

    String naziv;
    int ID;
    private double cena;
    private boolean popust;

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public boolean isPopust() {
        return popust;
    }

    public void setPopust(boolean popust) {
        this.popust = popust;
    }

    public Proizvod(String naziv, int ID) {
        this.naziv = naziv;
        this.ID = ID;
    }

    public void stampa() {

        if (isPopust()) {
            System.out.println(this.naziv + " imaju ID " + this.ID + " i kostaju  sa popustom " + getCena());
        } else {
            System.out.println(this.naziv + " imaju ID, " + this.ID + " nisu na popustu i kostaju "+ getCena() + " dinara" );

        }
    }
}

