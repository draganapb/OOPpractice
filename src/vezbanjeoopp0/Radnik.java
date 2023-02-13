package vezbanjeoopp0;

public class Radnik {
    //Napraviti klasu Radnik koja ima ime, poziciju i platu. U glavnoj klasi napraviti dva radnika, proveriti
    // cija je plata veca, istampati informacije radnika cija je plata veca, uz 20% vecu platu.
    String ime;
    String pozicija;
    double plata;

    public Radnik(String ime, String pozicija, double plata) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.plata = plata;
    }
    public void provera(Radnik r1, Radnik r2){
        if(r1.plata>r2.plata){
            r1.plata = r1.plata + (r1.plata/5);
            System.out.println("r1 ima vecu" + r1.plata);        }
        else if(r2.plata>r1.plata){
            r2.plata = r2.plata + (r2.plata/5);
            System.out.println("r2 ima vecu" + r2.plata);        }

        }
   public void stampa(){

    }
}
