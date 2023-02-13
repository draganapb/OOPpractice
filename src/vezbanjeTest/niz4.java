package vezbanjeTest;

import java.util.Scanner;

public class niz4 {
    public static void main(String[] args) {
       // Preko skenera uneti velicinu niza, zatim preko skenera uneti sve clanove
//Odstampati samo parne brojeve u nizu

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza");
        int length = sc.nextInt();
        int niz[]= new int[length];

        for(int i =0; i<length; i++){
            System.out.println("Unesite clanove niza");
             niz[i]= sc.nextInt();
        }


        for(int i =0; i<length; i++) {

            if (niz[i] % 2 == 0) {
                System.out.println("Parni clanovi niza su: " + niz[i]);
            }


        }














    }
}
