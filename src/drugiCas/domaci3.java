package drugiCas;

import java.util.Scanner;

public class domaci3 {
    public static void main(String[] args) {

        /*Napisati program gde unosite godinu koje ste krenuli da radite(npr 1998, 2001,..),
         zatim izracunavate godine radnog iskustva,
         ako imate manje od 4 ili 4 godine radnog iskustva,onda ste Junior programer
         (Napraviti ispis "Ti si Junior programer"),
       ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer("Ti si Senior programer"),
          ako imate vise od 8 godina onda ste direktor firme("Vi ste direktor firme").*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite trenutnu godinu: ");
        int godina = sc.nextInt();

        System.out.println("Unesite godinu kada ste poceli da radite: ");
        int radnaGod = sc.nextInt();
        int staz = godina - radnaGod;






        if (staz >= 0 && staz <= 4) {
            System.out.println("Ti si Junior programer");
        }
        else if (staz>4 && staz<=8) {
            System.out.println("Ti si Senior programer");

        }
        else if (staz > 8 && staz< 60) {
            System.out.println("Vi ste Direktor firme");
        }
        else if (staz == 0) {
            System.out.println("Ti si Junior programer");
       }
        else if (staz>=60 || staz<0)
        {
            System.out.println("Nevalidni podaci");
        }




    }



}
