package Cetvrti_cas;

import java.util.Scanner;

public class peticavezba2 {
    public static void main(String[] args) {


        //Napraviti program gde cete uneti broj nekih knjiga na lageru,
        // zatim svaki put kada unesete '.' on ce skinuti po jednu knjigu sa lagera,
        //tek nakon sto unesete neki drugi string ili ponestaje knjiga na
        // lageru, izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
        //ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki
        // drugi String, onda samo ispisati stanje knjiga na lageru.

    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tacku");

        String s = ".";

        int lager = 5;
        int brojac = 0;
        int stanje = lager - brojac;
        while (s.equals(".") && lager > 0) {
            s = sc.next();
            lager = lager-1;
            brojac = brojac + 1;
            System.out.println(lager);
            if (!s.equals(".")) {
                System.out.println("stanje je " + stanje);
                break;
            }

            else if (lager == 0) {
                System.out.println("Nema");
            }


        }
*/

 /*       Scanner sc = new Scanner(System.in);
        System.out.println("broj");
        int broj = sc.nextInt();
        int suma = 0;
        int i = 0;
        while(i<broj){
            suma = suma + i;

            i++;
        }
        System.out.println(suma);

*/

        //Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din,
// kruske 100 din i banane 140 din, tako da se suma
//racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo),
// toliko dodajemo na sumu, kada se unese ".",
//program izlazi iz petlje i pise ukupnu cenu navedenog voca.


        Scanner sc=new Scanner(System.in);
        String voce="jabuka";
        int suma = 0;
        while(voce.equals("jabuka") || voce.equals("banana") || voce.equals("kruska")){
            System.out.println("Uneti naziv voca: ");
            voce = sc.next();
            switch(voce){
                case "jabuka": suma = suma +50;
                break;
                case "kruska": suma = suma +140;
                break;
                case "banana": suma = suma +200;
                break;
            }
            System.out.println(suma);
        }



    }
}

