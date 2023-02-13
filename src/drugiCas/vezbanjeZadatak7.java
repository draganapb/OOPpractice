package drugiCas;

import java.util.Scanner;

public class vezbanjeZadatak7 {
    public static void main(String[] args) {

        //Preko skenera uneti godinu
//Program proverava da li je godina prestupna i ispisuje

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu: ");
        int godina = sc.nextInt();

        if (godina > 0) {
            if (godina % 4 == 0) {
                if (godina % 100 != 0 || godina % 400 == 0) {
                    System.out.println("Godina je prestupna");
                } else {
                    System.out.println("Godina nije prestupna");
                }
            }

        }
    }
}
