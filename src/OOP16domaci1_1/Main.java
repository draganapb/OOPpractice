package OOP16domaci1_1;

public class Main {

  /*  Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac,
    SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
    Istampati njihove podatke sa
    tim da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru
    ako je digao bar 5 zgrada.*/
  public static void main(String[] args) {


Radnik fizikalac1 = new Radnik(123, "Aleksa Milic", 5, 100000);
Radnik fizikalac2 = new Radnik(234, "Mina Lalic", 6, 200000);
Radnik sefSmene1 = new Radnik(345,"Milan Lukic", 10, 250000);
Radnik sefSmene2 = new Radnik(456, "Goran Kolarov", 4, 120000);

Fizikalac f1 = new Fizikalac(fizikalac1.id, fizikalac1.nazivRadnika, fizikalac1.godIskustva, fizikalac1.plata);
Fizikalac f2 = new Fizikalac(fizikalac2.id, fizikalac2.nazivRadnika, fizikalac2.godIskustva, fizikalac2.plata);
f1.stampa();
f2.stampa();

SefSmene sef1 = new SefSmene(sefSmene1.id, sefSmene1.nazivRadnika, sefSmene1.godIskustva, sefSmene1.plata);
SefSmene sef2 = new SefSmene(sefSmene2.id, sefSmene2.nazivRadnika, sefSmene2.godIskustva, sefSmene2.plata);
sef1.stampa();
sef2.stampa();

Investitor i1 = new Investitor(567, "Milos Pilerov", 9, 500000, 6);
Investitor i2 = new Investitor(568, "Nikola Selak", 4, 400000, 4);
i1.stampa();
i2.stampa();
  }
}
