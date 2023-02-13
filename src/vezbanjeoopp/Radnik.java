package vezbanjeoopp;

public class Radnik {
    /*  Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac,
    SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
    Istampati njihove podatke sa
    tim da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru
    ako je digao bar 5 zgrada.*/

    public Radnik(int id, String nazivRadnika, int godIskustva, double plata) {
        this.id = id;
        this.nazivRadnika = nazivRadnika;
        this.godIskustva = godIskustva;
        this.plata = plata;
    }

    int id;
    String nazivRadnika;
    int godIskustva;
    double plata;

    public void plata(){
        if(this.godIskustva>5){
            this.plata = this.plata + (this.plata/5);
        }
        System.out.println(this.nazivRadnika + this.plata);

    }





}
