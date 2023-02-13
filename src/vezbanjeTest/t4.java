package vezbanjeTest;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {

        //Kreirati program za login gde korisnik moze najvise 3 puta da unese username i password
        //Ako tri puta pogresi unos ispisati "Neuspesan login. Pokusajte ponovo."


        Scanner sc = new Scanner(System.in);
        int brojac = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("Unesite username: ");
            String user = sc.next();
            System.out.println("Unesite password: ");
            int password = sc.nextInt();

            if (user.equalsIgnoreCase("gaga") && password == 123) {
                System.out.println("Uspesan login");
                break;
            }
            if (!user.equalsIgnoreCase("gaga") && password == 123) {
                System.out.println("Pogresan username");
            }
            if (user.equalsIgnoreCase("gaga") && password != 123) {
                System.out.println("Pogresna lozinka");
            } else {
                brojac = brojac + 1;
                if (brojac == 3) {
                    System.out.println("pokusajte ponovo");
                }
            }

        }


    }
}












