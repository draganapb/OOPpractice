package OOP16domaci1_1;

public class Investitor extends Radnik{
    /*  Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac,
    SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
    Istampati njihove podatke sa
    tim da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru
    ako je digao bar 5 zgrada.*/
    int brojZgrada;

    public Investitor(int id, String nazivRadnika, int godIskustva, double plata, int brojZgrada) {
        super(id, nazivRadnika, godIskustva, plata);
        this.brojZgrada = brojZgrada;
    }
    public void stampa(){
        if(brojZgrada>5){
            this.plata = this.plata+(0.3*this.plata);
            System.out.println(this.nazivRadnika + " je investitor koji je podigao " + this.brojZgrada + " zgrada i ima platu od  " + this.plata);
        }
        else{
            System.out.println(this.nazivRadnika + " je investitor koji je podigao " + this.brojZgrada + "  zgrada i ima platu od  " + this.plata);

        }
    }
}
