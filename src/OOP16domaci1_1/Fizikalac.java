package OOP16domaci1_1;

public class Fizikalac extends Radnik{
    /*Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac,
    SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
    Istampati njihove podatke sa
    tim da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru
    ako je digao bar 5 zgrada.*/
    public Fizikalac(int id, String nazivRadnika, int godIskustva, double plata) {
        super(id, nazivRadnika, godIskustva, plata);
    }

}

