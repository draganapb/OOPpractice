package TreciCas;

import java.util.Scanner;

public class TreciCasZadatak4 {
    public static void main(String[] args) {
        ////Zadatak 12
        ////Napisati program gde unosite ime grada (Beograd, Novi Sad, Nis, Zrenjanin, Subotica)
        // i za svaki grad ispisati njegov pozivni broj.
        ////Takodje preko skenera upisati i broj telefona koji treba da se spoji sa pozivnim brojem
        ////Primer ako korisnik unese Beograd i zatim 703703 onda treba da se ispise 011703703

        Scanner sc = new Scanner (System.in);
        System.out.println("Unesite ime grada: ");
        String grad = sc.next();
        System.out.println("Unesite broj telefona");
        int broj = sc.nextInt();

        switch(grad){

            case "Beograd": System.out.println("011" + broj);
            break;

            case "Novi Sad": System.out.println( "021" + broj);
            break;

            case "Nis": System.out.println("018" + broj);
            break;

            case "Zrenjanin": System.out.println("023" + broj);
            break;

            case "Subotica": System.out.println("024" + broj);
            break;


        }






    }
}
