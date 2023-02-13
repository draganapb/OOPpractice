package oop16domaci;

public class Main {
    public static void main(String[] args) {
       /* Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac,
        SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
        Istampati njihove podatke sa
        tim da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru
        ako je digao bar 5 zgrada.*/


        Radnik fizikalac = new Radnik(123,"Aco Maric", 5, 80000);
        fizikalac.stampa();
        Radnik sefSmene = new Radnik(456, "Miki Jeric", 5, 130000);
        sefSmene.stampa();
        Radnik investitor = new Radnik(789,"Kristijan Lukic", 8, 200000);
        investitor.stampa();

        Fizikalac f1 = new Fizikalac(fizikalac.id, "Mihajlo Lukic",6,120000 );
        f1.stampa();

        SefSmene sef1 = new SefSmene(sefSmene.id, "Ana Kikin", 6, 200000);
        sef1.stampa();

        Investitor i1 = new Investitor(investitor.id, "Gagi Gogic", 8, 500000, 8);
        i1.stampa();





    }
}
