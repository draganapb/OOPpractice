package TreciCas;

import java.util.Scanner;

public class TreciCasZadatak2_resenje {
    public static void main(String[] args) {
        //Zadatak 10
//Korisnik preko skenera unosi naziv meseca
//Zavisno koji mesec unese treba da se ispise poruka koji je to mesec po redu u godini
//Ako ne unese naziv meseca program treba da napise poruku "Greska"

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv meseca");
        String mesec = sc.next();

        //mogu u parametru da ubacim prebacivanje u lower case ili mogu da uradim to kod unosa preko skenera u 12. redu
        switch (mesec.toLowerCase()) {
            case "januar":
                System.out.println(mesec + " je prvi mesec");
                break;

            case "februar":
                System.out.println(mesec + " je drugi mesec");
                break;

            case "mart":
                System.out.println(mesec + " je treci mesec");
                break;

            case "april":
                System.out.println(mesec + " je cetvrti mesec");
                break;

            case "maj":
                System.out.println(mesec + " je peti mesec");
                break;

            case "jun":
                System.out.println(mesec + " je sesti mesec");
                break;

            case "jul":
                System.out.println(mesec + " je sedmi mesec");
                break;

            case "avgust":
                System.out.println(mesec + " je osmi mesec");
                break;

            case "septembar":
                System.out.println(mesec + " je deveti mesec");
                break;

            case "oktobar":
                System.out.println(mesec + " je deseti mesec");
                break;

            case "novembar":
                System.out.println(mesec + " je jedanaesti mesec");
                break;

            case "decembar":
                System.out.println(mesec + " je dvanaesti mesec");
                break;

            default:
                System.out.println("Pogresan unos");
                break;
        }


    }
}