package TreciCas;

import java.util.Scanner;

public class TreciCasZadatak3_resenje {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite mesec");
        String mesec = sc.next();

        switch (mesec.toLowerCase()) {
            case "januar", "mart", "maj", "jul", "avgust", "oktobar", "decembar":
                System.out.println(mesec + " ima 31 dan");
                break;

            case "april", "jun", "septembar", "novembar":
                System.out.println(mesec + " ima 30 dana");
                break;

            case "februar":
                System.out.println(mesec + " ima 28 dana");
                break;

            default:
                System.out.println("Pogresan unos");
                break;
        }


    }
}