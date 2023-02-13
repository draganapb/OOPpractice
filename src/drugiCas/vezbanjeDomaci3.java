package drugiCas;

import java.util.Scanner;

public class vezbanjeDomaci3 {
    public static void main(String[] args) {

        /*Napisati program gde unosite godinu koje ste krenuli da radite(npr 1998, 2001,..),
         zatim izracunavate godine radnog iskustva,
         ako imate manje od 4 ili 4 godine radnog iskustva,onda ste Junior programer
         (Napraviti ispis "Ti si Junior programer"),
       ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer("Ti si Senior programer"),
          ako imate vise od 8 godina onda ste direktor firme("Vi ste direktor firme").*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu kada ste krenuli da radite");
        int godina = sc.nextInt();
        int staz = 2022-godina;


        if(staz <=4 && staz >=0){
            System.out.println("Vi ste junior");
        }
        else if (staz >4 && staz<=8){
            System.out.println("Vi ste senior");
        }
        else if( staz > 8 && staz <60){
            System.out.println("Vi ste direktor");
        }
        else{
            System.out.println("Neispravav unos");
        }











































    }
}
