package Cetvrti_cas;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        //1. Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj:" );
        int x = sc.nextInt();
        int faktorijel = 1;

        for( int i = 1; i<=x; i++) {
            faktorijel = faktorijel * i;
        }
        System.out.println(faktorijel);




        }

    }

