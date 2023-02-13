package OOP15;

import java.util.ArrayList;

public class Mentor extends QA {
    //OOP16 - Kreirati klasu IT koja ce imati atribute pocetna plata i godine u firmi
//Kreirati klasu QA koja ce naslediti klasu IT i imati atribute listu programskih jezika
//Ako je zaposlen u firmi duze od 3 godine
//onda ima povecanje od 20%, a ako je duze od 5 godina onda ima povecanje od 50%
//Ako u listi programskih jezika ima javu onda dobija godisnje bonus 3% od godisnje plate
//Kreirati klasu Mentor koja ce naslediti klasu QA i ima atribut koliko njima je zaposleni mentor (int 3/mentor za troje, 3 posto bonusa
    //na godisnju platu)
//Za svakog kome je mentor ima po 1% vise bonusa godisnje plate
//Odstampati razliku u plati u evrima i koliki je godisnji bonus u evrima
    int broj;

    public Mentor(int pocetnaPlata, int godine, ArrayList<String> programskiJezik, int broj) {
        super(pocetnaPlata, godine, programskiJezik);
        this.broj = broj;
    }

    public void stampa(){

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


        double plataGodisnja = 12*this.pocetnaPlata;
        double bonusPlataGodisnjaMentora = 12*this.pocetnaPlata + 12*this.pocetnaPlata*this.broj/100;
        System.out.println("Mentor ima " + broj + " ucenika " + "i godisnja plata sa bonusom iznosi " + bonusPlataGodisnjaMentora);
        System.out.println("Godisnji bonus u evrima je " + (bonusPlataGodisnjaMentora-plataGodisnja)/118 + "evra");

    }
}
