package vezbanjeTest;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        //Zadatak17
//Korisnik najvise 5 puta moze da pogodi "bingo" broj
//Ako unese 0 prikaze se poruka "Bingo!" i izlazi iz petlje

       Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            System.out.println("Unesite broj: ");
            int x = sc.nextInt();


            if(x==0){
                System.out.println("Bingo");
                break;
            }

        }




     /* //  Do kog broja zelite da stampate sve prethodne brojeve?"

        Scanner sc = new Scanner(System.in);
        System.out.println("Do kog broja zelite stampati brojeve?");
        int x = sc.nextInt();

        for(int i = 0; i<x; i++){
            System.out.println(i);
        }


*/



    }
}
