package oop16domaci;

public class Investitor extends Radnik {
int brojZgrada;

    public Investitor(int id, String nazivRadnika, int godineIskustva, double plata, int brojZgrada) {
        super(id, nazivRadnika, godineIskustva, plata);
        this.brojZgrada = brojZgrada;
    }

    public void stampa(){
        if(this.brojZgrada>5){
            this.plata = this.plata+(this.plata*0.3);
            System.out.println(this.nazivRadnika + "ima" + this.godineIskustva + " godine iskustva. Podigao je " + this.brojZgrada + " zgrada i ima platu od " +
                    this.plata + " dinara");
        }
        else{
            System.out.println(this.nazivRadnika + "ima" + this.godineIskustva + " godine iskustva. Podigao je " + this.brojZgrada + " zgrada i ima platu od " +
                    this.plata + " dinara");
        }
    }
}
