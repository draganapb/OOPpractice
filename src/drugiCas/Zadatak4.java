package drugiCas;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

                     //Zadatak 4
                    //Preko skenera uneti broj godina korisnika
                    //Ako je korisnik punoletan ispisati "Mozete koristiti aplikaciju"
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj godina");
        int godine = sc.nextInt();

        if (godine >= 18) {
            System.out.println("Korisnik je punoletan i ima " + godine + " godina");
        } else {
            System.out.println("Korisnik je maloletan i ima " + godine + " godina");
        }


        //-----------------------|--------------------------------

    }


}