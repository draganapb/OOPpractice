package vezbanjeTest;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {



//Zadatak 41 - Preko skenera uneti koliko redova da ima trougao sa zvezdicama
                //Preko skenera uneti i sta ce da se stampa (zvezdica ili neki drugi simbol)

                Scanner sc = new Scanner(System.in);
                System.out.println("Koliko redova zelite?");
                int x = sc.nextInt();
                System.out.println("Sta stampamo?");
                String stampa = sc.next();
                String jedinica = stampa;
                for (int i = 0; i < x; i++) {
                    System.out.println(stampa);
                    stampa = stampa + jedinica;
                }


            }
        }

