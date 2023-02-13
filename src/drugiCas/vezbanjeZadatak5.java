package drugiCas;

import java.util.Scanner;

public class vezbanjeZadatak5 {
    public static void main(String[] args) {

        //Zadatak 5 moj nacin
        //Korisnik unosi broj godina i stanje na racunu
        //Ako korisnikima izmedju 20 i 30 godina treba mu dodati jos 5000 na racun
        //
           Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pol");
        String pol = sc.next();
        System.out.println("Unesite broj godina");
        int godina = sc.nextInt();
        System.out.println("Unesite stanje na racunu");
        int racun = sc.nextInt();
        int stanje = racun + 5000;

        if(godina>=20 && godina < 30){
            if (pol.equalsIgnoreCase("muski")){
                System.out.println("Dobrodosli, gospodine, vase stanje na racunu je" + stanje);
            }
            else if (pol.equalsIgnoreCase("zenski")){
                System.out.println("Dobrodosli, gospodjo, vase stanje na racunu je " + stanje);
            }

        }
        else {
            System.out.println("Ne ispunjavate uslove");


        }














    }
}
