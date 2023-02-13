package Osmicas;

import java.util.Scanner;

public class cas8_5_zadatak {
    public static void main(String[] args) {

//Zadatak 46 - Napraviti main metodu i dve metode tipa int.
// U jednoj metodi staviti fiksan return 10, a u drugoj uvesti skener i uneti neki broj.
// U main metodi treba pomnoziti ove dve metode

                int mnozenje = broj1() * broj2();
                System.out.println(mnozenje);

            }

            public static int broj1() {
                return 10;
            }

            public static int broj2() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Unesite neki broj");
                int x = sc.nextInt();
                return x;
            }

        }
