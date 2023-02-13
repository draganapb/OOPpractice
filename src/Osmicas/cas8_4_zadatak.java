package Osmicas;

import java.util.Scanner;

public class cas8_4_zadatak {
    public static void main(String[] args) {

                //Mozemo kompletan zadatak da uradimo u drugoj metodi i samo pozivanjem iste u main metodi
                //ce biti isto kao da smo sve to uradili u main metodi

                zadatak3();
            }
            public static void zadatak3() {
                //Zadatak 3
//Preko skenera uneti dva broja i odstampati aritmeticku sredinu dva uneta broja

                Scanner sc = new Scanner(System.in);
                int x,y;

                System.out.println("Unesite prvi broj");
                x = sc.nextInt();

                System.out.println("Unesite drugi broj");
                y = sc.nextInt();

                double z = (x+y)/2.0;

                System.out.println("Aritmeticka sredina je " + z);
            }

        }
