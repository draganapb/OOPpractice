package za;

import java.util.Scanner;

public class zzz {
    public static void main(String[] args) {
//Napraviti program gde cete uneti broj nekih knjiga na lageru,
        // zatim svaki put kada unesete '.' on ce skinuti po jednu knjigu sa lagera,
        //tek nakon sto unesete neki drugi string ili ponestaje knjiga na
        // lageru, izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
        //ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki
        // drugi String, onda samo ispisati stanje knjiga na lageru.


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj knjiga: ");
        int lager = sc.nextInt();
        String tacka = ".";

        while(tacka.equals(".")){
            System.out.println("Unesite tacku: ");
            tacka = sc.next();

            if(tacka.equals(".")){
                lager = lager - 1;
                System.out.println("LaGer" + lager);
            }
            if(lager==0){
                System.out.println("nema");
                break;
            }

        }
        System.out.println("stanje je " + lager);

    }
}
