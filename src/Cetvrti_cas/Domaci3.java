package Cetvrti_cas;

import java.util.Scanner;

public class Domaci3 {
    public static void main(String[] args) {

       // Napraviti program gde unosite 5 brojeva i uz poruku ispisati koji je bio najveci od svih njih. (edited)
        int a;
        int maks = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5; i++) {

            System.out.println("Unesi broj");
            a = sc.nextInt();

                if (i == 0) {
                    maks = a;
                }
                if (a > maks) {
                    maks = a;
                }
        }
        System.out.println("Najveci broj je " +maks);















    }
}
