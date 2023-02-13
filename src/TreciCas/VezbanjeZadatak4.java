package TreciCas;

import java.util.Locale;
import java.util.Scanner;

public class VezbanjeZadatak4 {
    public static <string> void main(String[] args) {

        //Zadatak 12
//Napisati program gde unosite ime grada (Beograd, Novi Sad, Nis, Zrenjanin, Subotica) i za svaki grad
// ispisati njegov pozivni broj.
//Takodje preko skenera upisati i broj telefona koji treba da se spoji sa pozivnim brojem
//Primer ako korisnik unese Beograd i zatim 703703 onda treba da se ispise 011703703

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime grada: ");
        String grad = sc.next();
        System.out.println("Unesite broj telefona: ");
        int broj = sc.nextInt();
        String pozivni = "";

        switch(grad.toUpperCase()) {

            case "Beograd":
                pozivni = "011";
                System.out.println("Broj koji ste uneli je " + pozivni + broj);

            break;


        }









    }
}
