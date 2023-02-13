package Cetvrti_cas;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        //2. Napraviti program gde unosite svoju godinu rodjenja i ispisati broj prestupnih godina
        // od vaseg rodjenja do tekuce godine.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja");
        int godina = sc.nextInt();
        int tekuca = 2022;
        int broj = 2022 - godina;
        int brojac = 0;
        for (int i = godina; i <= tekuca; i++) {

            if (i % 4 == 0) {
                if (i % 100 != 0 || i % 400 == 0) {
                    brojac = brojac + 1;
                    System.out.println(i);
                }
            }
        }
        System.out.println(brojac);
    }
}
