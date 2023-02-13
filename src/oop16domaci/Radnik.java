package oop16domaci;

public class Radnik {
    /* Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac,
        SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
        Istampati njihove podatke sa
        tim da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru
        ako je digao bar 5 zgrada.*/

    int id;
    String nazivRadnika;
    int godineIskustva;
    double plata;

    public Radnik(int id, String nazivRadnika, int godineIskustva, double plata) {
        this.id = id;
        this.nazivRadnika = nazivRadnika;
        this.godineIskustva = godineIskustva;
        this.plata = plata;
    }

   /*
    public void stampa(){
        if(this.godineIskustva>5){
            this.plata = this.plata+(this.plata/5);
            System.out.println(this.nazivRadnika + " ima " + this.godineIskustva +
                    " godine iskustva i platu od " + this.plata);
        }
        else{
            System.out.println(this.nazivRadnika + " ima " + this.godineIskustva +
                    " godine iskustva i platu od " + this.plata);
        }}



*/


   public void stampa(){
      System.out.println((this.nazivRadnika) + " ima "+ this.godineIskustva + " godina iskustva i platu od " + this.plata + "dinara.");
  }
}




