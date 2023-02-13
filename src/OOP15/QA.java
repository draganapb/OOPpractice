package OOP15;

import java.util.ArrayList;
import java.util.List;

public class QA extends IT{
    //OOP16 - Kreirati klasu IT koja ce imati atribute pocetna plata i godine u firmi
//Kreirati klasu QA koja ce naslediti klasu IT i imati atribute listu programskih jezika
//Ako je zaposlen u firmi duze od 3 godine
//onda ima povecanje od 20%, a ako je duze od 5 godina onda ima povecanje od 50%
//Ako u listi programskih jezika ima javu onda dobija godisnje bonus 3% od godisnje plate
//Kreirati klasu Mentor koja ce naslediti klasu QA i ima atribut koliko njima je zaposleni mentor
//Za svakog kome je mentor ima po 1% vise bonusa godisnje plate
//Odstampati razliku u plati u evrima i koliki je godisnji bonus u evrima
   ArrayList<String> programskiJezik = new ArrayList<>();
       //programskiJezik.add("Java");

    public QA(int pocetnaPlata, int godine, ArrayList<String> programskiJezik) {
        super(pocetnaPlata, godine);
        this.programskiJezik = programskiJezik;
    }

    public void povecanjeProvera(){
        double povecanje = this.pocetnaPlata+(this.pocetnaPlata*0.3);
        if(this.godine>3 && this.godine<=5){
            System.out.println("Zaposleni ima povecanje plate od 20% koje iznosi " + povecanje + " dinara" );
            System.out.println("Razlika u odnosu na prethodnu platu u evrima je " + (povecanje - this.pocetnaPlata)/118 + " evra.");
        }
        else if(this.godine>5){
            double povecanje2 = this.pocetnaPlata+(this.pocetnaPlata/2);
            System.out.println("Zaposleni ima povecanje plate od 50% koje iznosi " + povecanje2 + " dinara.");
            System.out.println("Razlika u odnosu na prethodnu platu u evrima je " + (povecanje2-this.pocetnaPlata)/118 + " evra.");
        }
        double godisnjaPlata = 12*this.pocetnaPlata;
        double godisnjiBonusPlata =(12*this.pocetnaPlata)+(12*0.03*this.pocetnaPlata);
        for(int i = 0; i<programskiJezik.size(); i++){

            if(programskiJezik.get(i).equals("java")){
             //   System.out.println("Godisnja plata sa  bonusom zbog poznavanja Jave iznosi  " + godisnjiBonusPlata + " dinara.");
                System.out.println("Godisnji bonus u evrima iznosi(java) " + (godisnjiBonusPlata-godisnjaPlata)/118 + " evra.");
            }
            else{
                System.out.println("Nema godisnjeg  bonusa za poznavanje Jave");
            }
        }


    }

    public void proveraJezika(){
       /* double godisnjaPlata = 12*this.pocetnaPlata;
        double godisnjiBonusPlata =(12*this.pocetnaPlata)+(12*0.03*this.pocetnaPlata);
        for(int i = 0; i<programskiJezik.size(); i++){


        if(programskiJezik.get(i).equals("java")){
            System.out.println("Plata sa godisnjim bonusom je" + godisnjiBonusPlata);
            System.out.println("Godisnji bonus u evrima iznosi " + (godisnjiBonusPlata-godisnjaPlata)/118);
        }
        else{
            System.out.println("ne zna javu");
        }
        }

        */
    }

}
