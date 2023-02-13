package drugiCas;

import java.util.Scanner;

public class Zadatak5vezba {
    public static void main(String[] args) {
        //Korisnik unosi broj godina i stanje na racunu
        //Ako korisnik ima izmedju 20 i 30 godina treba mu dodati jos 5000 na racun

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj godina");
        int godina = sc.nextInt();
        System.out.println("Unesite stanje na racunu: ");
        int stanje = sc.nextInt();
        System.out.println("Unesite pol");
        String pol = sc.next();

        if (godina >= 20 && godina < 30 && pol.equalsIgnoreCase("muski")) {
            stanje = stanje + 5000;
            System.out.println("Vase stanje na racunu je " + stanje);
        }

        else if(godina >=20 && godina<30&& pol.equalsIgnoreCase("zenski")){
            stanje = stanje + 5000;
            System.out.println("Gospodjo, Vase stanje na racunu je " + stanje);


        }

        else
    {
        System.out.println("Ne ispunjavate uslove");
    }











    }







    }
