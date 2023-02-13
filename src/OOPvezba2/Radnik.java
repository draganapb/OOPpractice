package OOPvezba2;

public class Radnik {
    //Napraviti klasu Radnik koja ima ime, poziciju i platu. U glavnoj klasi napraviti dva radnika, proveriti
    // cija je plata veca, istampati informacije radnika cija je plata veca, uz 20% vecu platu.
    String ime;
    String pozicija;
    int plata;

    public Radnik(String ime, String pozicija, int plata) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.plata = plata;
    }

    public  void stampa() {
        int povecanaplata = this.plata + (this.plata/5);
        System.out.println(this.ime + " ima vecu platu. Ona sa povecanjem od 20% iznosi " + povecanaplata);
    }

}
