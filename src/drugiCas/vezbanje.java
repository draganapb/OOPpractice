package drugiCas;

import java.util.Scanner;

public class vezbanje {
    public static void main(String[] args) {
        //Zadatak 4
        //Preko skenera uneti broj godina korisnika
        //Ako je korisnik punoletan ispisati "Mozete koristiti aplikaciju"


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj godina");
        int x = sc.nextInt();

        if(x>=18){
            System.out.println("Mozete koristiti aplikaciju");
             if (x%2==0){
                 System.out.println("vas broj godina je deljiv sa dva");
             }
             else{
                 System.out.println("Nije deljiv sa dva broj godina");
             }
        }
        else{
            System.out.println("Niste punoletni");
        }







    }
}
