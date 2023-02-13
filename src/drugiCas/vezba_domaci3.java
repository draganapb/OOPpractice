package drugiCas;

import java.util.Scanner;

public class vezba_domaci3 {

    public static void main(String[] args) {
        /*Napisati program gde unosite godinu koje ste krenuli da radite(npr 1998, 2001,..),
         zatim izracunavate godine radnog iskustva,
         ako imate manje od 4 ili 4 godine radnog iskustva,onda ste Junior programer
         (Napraviti ispis "Ti si Junior programer"),
       ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer("Ti si Senior programer"),
          ako imate vise od 8 godina onda ste direktor firme("Vi ste direktor firme").*/

    Scanner sc = new Scanner(System.in);
    System.out.println("Pocetak rada");
    int god = sc.nextInt();
    System.out.print("Trenutna god");
    int trGod = sc.nextInt();
    int staz = trGod - god;

    if(staz<=4 && staz>=0) {
        System.out.println("Junior");
    }
























































    }


}
