package vezbe;

import java.util.Scanner;

public class vezbe10 {
    public static void main(String[] args) {
         /*Napisati program gde unosite godinu koje ste krenuli da radite(npr 1998, 2001,..),
         zatim izracunavate godine radnog iskustva,
         ako imate manje od 4 ili 4 godine radnog iskustva,onda ste Junior programer
         (Napraviti ispis "Ti si Junior programer"),
       ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer("Ti si Senior programer"),
          ako imate vise od 8 godina onda ste direktor firme("Vi ste direktor firme").*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu kada ste krenuli da radite: ");
        int god = sc.nextInt();
        int iskustvo = 2022-god;

        if(iskustvo>=0 && iskustvo<65){
            if(iskustvo<=4){
                System.out.println("junior");
            }
            else if(iskustvo<=8){
                System.out.println("senior");
            }
            else{
                System.out.println("direktor");
            }


        }

        else{
            System.out.println("nevalidna godina");
        }







    }
}
