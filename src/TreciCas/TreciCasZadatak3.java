package TreciCas;

import java.util.Scanner;

public class TreciCasZadatak3 {
    public static void main(String[] args) {
        //Napraviti program koji prilikom unosa nekog meseca(String), vraca koliko taj mesec ima dana.
        ///napravila sam ovde varijantu da se switch ubaci u petlju
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite mesec: ");
        String mesec;

        int i = 1;
        while (i > 0) {
            mesec = sc.next();

            switch (mesec) {
                case "januar", "februar", "mart":
                    System.out.println("prva 3");
                    break;

                case "april", "maj", "jun":
                    System.out.println("druga tri");
                    break;

                default:
                    System.out.println("greska");


            }
        }
    }
}

