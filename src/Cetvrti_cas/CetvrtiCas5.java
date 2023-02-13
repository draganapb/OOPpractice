package Cetvrti_cas;

import java.util.Scanner;

public class CetvrtiCas5 {
    public static void main(String[] args) {

        //Zadatak17
//Korisnik najvise 5 puta moze da pogodi "bingo" broj
//Ako unese 0 prikaze se poruka "Bingo!" i izlazi iz petlje
        //  for (int i = 0; i < 5; i++) {

        Scanner sc = new Scanner(System.in);

        int broj;
        for (int i = 0; i < 5; i++) {
            System.out.println("Unesite broj");
            broj = sc.nextInt();
            if(broj==0){
                System.out.println("Bingo");
                break;
            }


        }

    }
}
