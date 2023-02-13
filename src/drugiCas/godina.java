package drugiCas;

import java.util.Scanner;

public class godina {
    public static void main(String[] args) {


//Preko skenera uneti godinu
//Program proverava da li je godina prestupna i ispisuje rezultat
        Scanner sc = new Scanner(System.in);
        System.out.println(" Unesite godinu: ");
        int godina = sc.nextInt();

        if (godina > 0) {
            if (godina % 4 == 0) {
                if (godina % 100 == 0) {
                    if (godina % 400 == 0) {

                        System.out.println("Godina je prestupna");
                    } else {
                        System.out.println("Godina nije prestupna");
                    }
                } else {
                    System.out.println("Godina nije prestupna");
                }
            } else {
                System.out.println("Godina nije prestuona");
            }

        }else {
            System.out.println("gr");
        }


        }
    }

