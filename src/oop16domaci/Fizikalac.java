package oop16domaci;

public class Fizikalac extends Radnik{
    /* Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac,
        SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
        Istampati njihove podatke sa
        tim da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru
        ako je digao bar 5 zgrada.*/

    public Fizikalac(int id, String nazivRadnika, int godineIskustva, double plata) {
        super(id, nazivRadnika, godineIskustva, plata);



    }
public void stampa(){
        if(this.godineIskustva>5){
            this.plata = this.plata+(this.plata/5);
            System.out.println(this.nazivRadnika + " ima " + this.godineIskustva +
                    " godine iskustva i platu od " + this.plata);
        }
        else{
            System.out.println(this.nazivRadnika + " ima " + this.godineIskustva +
                    " godine iskustva i platu od " + this.plata);
        }
}
}
