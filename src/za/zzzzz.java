package za;

import java.util.Scanner;

public class zzzzz {
    public static void main(String[] args) {
        //Kreirati program za login gde korisnik moze najvise 3 puta da unese username i password
        //Ako tri puta pogresi unos ispisati "Neuspesan login. Pokusajte ponovo."

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite password i username");

        int brojac = 0;
        for(int i = 0; i<10; i++){
            System.out.println("Unesite username");
            String username = sc.next();
            System.out.println("Unesite password: ");
            int password = sc.nextInt();

            brojac = brojac + 1;
            if(username.equalsIgnoreCase("user") && password==123){
                System.out.println("Uspesan login");
            }
            else{
                System.out.println("Pogresan unos");
            }
            if(brojac == 2){
                System.out.println("jos jedan pokusaj imate");
            }
        }
        System.out.println("orekoracili ste dovoljen broj pokusaja, probajte ponovo");






    }
}
