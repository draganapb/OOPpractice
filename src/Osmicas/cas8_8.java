package Osmicas;

import java.util.Scanner;

public class cas8_8 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                sabiranje(a, b);

                //Drugi put pozivamo metodu i preko skenera unosimo ponovo brojeve
                sabiranje(sc.nextInt(), sc.nextInt());

            }

            public static void sabiranje(int x, int y) {
                int zbir = x + y;
                System.out.println("Sabiranje brojeva " + x + " i " + y + " je " + zbir);
            }

        }
