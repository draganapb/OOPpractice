package vezbanjeoopp;

public class Investitor extends Radnik{
    public Investitor(int id, String nazivRadnika, int godIskustva, double plata, int brojZgrada) {
        super(id, nazivRadnika, godIskustva, plata);
        this.brojZgrada = brojZgrada;
    }

    int brojZgrada;

    public void stampa(){
        if(this.brojZgrada>5){
            this.plata = this.plata+(0.3*plata);
            System.out.println(this.nazivRadnika + this.plata);
            }
        }
    }

