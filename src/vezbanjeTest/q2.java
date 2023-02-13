package vezbanjeTest;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

        //Zadatak 39 - Napisati niz koji ce se sabirati clanove do 100 (suma), kada predje 100 treba ispisati
        // za koliko je presao
//Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
//Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"

      /*  int niz [] = {128,30,35,45,50};
        int x = 100;
        int suma = 0;
        int i = 0;
        while(i<niz.length) {
            suma = suma + niz[i];
            i++;
            if (suma == 100) {
                break;
            }

            if (suma > 100) {
                int razlika = suma - x;
                System.out.println("Presli ste broj za " + razlika);


       */


        Scanner sc = new Scanner(System.in);
        System.out.println("unesi velicinu niza: ");
        int velicinaNiza = sc.nextInt();
        int niz[] = new int[velicinaNiza];
        System.out.println("unesi clanove niza:");

        int suma = 0;
        for(int i = 0; i<velicinaNiza; i++) {
            niz[i] = sc.nextInt();
            suma = suma + niz[i];
            if (suma > 100) {
                System.out.println("Premasili ste unos za " + (suma - 100));
            }

        }

    }
        }
















