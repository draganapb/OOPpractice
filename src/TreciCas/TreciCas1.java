package TreciCas;

import java.io.InputStream;
import java.util.Scanner;

public class TreciCas1 {
    public static void main(String[] args) {
    ////Zadatak 9
        ////Korisnik preko skenera unosi brojeve od 1 do 12
        ////Zavisno koji broj unese treba da se ispise poruka koji je to mesec po redu u godini
        ////Ako ne unese brojeve od 1 do 12 program treba da napise poruku "Greska"


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj od 1 do 12");
        int broj = sc.nextInt();


        switch (broj) {
            case 1: System.out.println("januar");
            break;

            case 2: System.out.println("februar");
            break;

            case 3: System.out.println("mart");
            break;

            case 4: System.out.println("april");
            break;

            case 5: System.out.println("maj");
            break;

            case 6: System.out.println("jun");
            break;

            case 7: System.out.println("jul");
            break;

            case 8: System.out.println("avgust");
            break;

            case 9: System.out.println("septembar");
            break;

            case 10: System.out.println("oktobar");
            break;

            case 11: System.out.println("novembar");
            break;


            case 12: System.out.println("decembar");
            break;

            default:
                System.out.println("greska");
                break;










        }

















    }
}
