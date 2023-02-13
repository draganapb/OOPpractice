package petiiCas;

import java.util.Scanner;

public class pettiCas5 {
    public static void main(String[] args) {

        //Zadatak 22
//Koristeci WHILE petlju napraviti program koji racuna profit prethodnih dana preko unetih brojeva
// sve dok korisnik ne unese 0

        //Prvi nacin

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Unesi profit dana");
        int profit = sc.nextInt();
        int prviBroj = profit;
        int suma = 0;

        while (profit!=0) {
            System.out.println("Unesi novi profit dana");
            profit = sc.nextInt();

            suma = suma + profit;
        }

        System.out.println("Suma je " + (suma+prviBroj));*/

        //--------------

        //Drugi nacin

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Unesi profit dana");
        int profit = sc.nextInt();
        int suma = profit;

        while (profit!=0) {
            System.out.println("Unesi novi profit dana");
            profit = sc.nextInt();

            suma = suma + profit;
        }

        System.out.println("Suma je " + suma);*/

        //---------------

        //Treci nacin

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.println("Unesi profit");
            int profit = sc.nextInt();

            if (profit==0) {
                break;
            }

            suma = suma + profit;

        }

        System.out.println("Suma je " + suma);



    }
}