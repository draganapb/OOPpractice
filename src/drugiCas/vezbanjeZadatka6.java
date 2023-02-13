package drugiCas;

import java.util.Scanner;

public class vezbanjeZadatka6 {
    public static void main(String[] args) {

       //Korisnik preko skenera unosi broj godina i pol
//Ako je korisnik stariji od 18 i muskog pola treba da se ispise "Dobrodosli gospodine"
//Ako je korisnik stariji od 18 i zenskog pola treba da se ispise "Dobrodosli gospodjo"
//Na kraju programa ispisati "Kraj programa"

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj godina");
        int godina = sc.nextInt();
        System.out.println("Unesite pol");
        String pol = sc.next();

        if (godina>18){
            if (pol.equalsIgnoreCase("muski") || pol.equalsIgnoreCase("m")){
                System.out.println("Dobrodosli, gospodine");
            }
            else if (pol.equalsIgnoreCase("zenski")){
                System.out.println("Dobrodosli, gospodjo");
            }
        }








    }
}
