package Cetvrti_cas;

import java.util.Scanner;

    public class CetvrtiCas8 {
        public static void main(String[] args) {

            //Zadatak 20
            //Kreirati program za login gde korisnik moze najvise 3 puta da unese username i password
            //Ako tri puta pogresi unos ispisati "Neuspesan login. Pokusajte ponovo."

            Scanner sc = new Scanner(System.in);
            System.out.println("Unesite username i password");
            String validUsername = "admin";
            String validPassword = "password1";

            int brojac = 0;
            for (int i = 1; i <= 3; i++) {
                System.out.println(i + ". pokusaj");
                System.out.println("Username:");
                String username = sc.next();
                System.out.println("Password:");
                String password = sc.next();

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("Uspesan login");
                    break;
                } else {
                    brojac = brojac + 1;
                    if (brojac==3) {
                        System.out.println("Neuspesan login. Pokusajte ponovo.");
                    }
                }


            }

            System.out.println("Kraj programa");

        }
    }

