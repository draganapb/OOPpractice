package TreciCas;

import java.util.Scanner;

public class TreciCasZadatak2 {
    public static void main(String[] args) {

        //Zadatak 10
//Korisnik preko skenera unosi naziv meseca
//Zavisno koji mesec unese treba da se ispise poruka koji je to mesec po redu u godini
//Ako ne unese naziv meseca program treba da napise poruku "Greska"

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite mesec u godini");
        String mesec = sc.next();

        switch (mesec){
            case "januar": System.out.println("drugi");
            break;

            case "februar": System.out.println("drugi");
                break;


            case "mart": System.out.println("treci");
                break;

            case "april": System.out.println("cetvrti");
                break;

            case "maj": System.out.println("peti");
                break;

            case "jun": System.out.println("sesti");
                break;

            case "jul": System.out.println("sedmi");
                break;

            case "avgust": System.out.println("osmi");
                break;

            case "septembar": System.out.println("deveti");
                break;


                case "oktobar": System.out.println("deseti");
                break;

            case "novembar": System.out.println("jedanaesti");
                break;

            case "decembar": System.out.println("dvanaesti");
                break;

            default:
                System.out.println("Greska");



        }















































    }
}
