package domaciOOP2;

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

    public void stampa(){
        this.plata = this.plata+(this.plata/5);
        System.out.println(this.ime + " na poziciji " + this.pozicija + " ima vecu platu koja s povecanjem iznosi " + this.plata + " dinara.");
    }

}
