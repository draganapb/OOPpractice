package vezbe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class vezbe12 {
    public static void main(String[] args) {
        //Napraviti program gde cete uneti broj nekih knjiga na lageru,
        // zatim svaki put kada unesete '.' on ce skinuti po jednu knjigu sa lagera,
        //tek nakon sto unesete neki drugi string ili ponestaje knjiga na
        // lageru, izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
        //ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki
        // drugi String, onda samo ispisati stanje knjiga na lageru.

        Scanner sc = new Scanner (System.in);
        System.out.println("Unesite broj knjiga: ");
        int lager = sc.nextInt();
        int stanje = 0;
        int i = 0;
        while(i < lager){
           System.out.println("unesi tacku");
           String tacka = sc.next();
        if(tacka.equals(".")){
            i = i+1;
            stanje = lager - i;
        }
        else{
            System.out.println("Stanje je" + stanje);
            break;
        }
        if(stanje==0){
            System.out.println("Nema vise knjiga na lageru");
        }

       }







    }
}
