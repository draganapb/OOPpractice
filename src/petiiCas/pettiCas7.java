package petiiCas;

import java.util.Scanner;

public class pettiCas7 {
    public static void main(String[] args) {

//Zadatak 23
//Prikazati sumu izmedju N i M broja
//Zadatak uraditi sa sve tri petlje odvojeno (moze i u razlicite klase svaka petlja)

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi N broj");
        int N = sc.nextInt();
        System.out.println("Unesi M broj");
        int M = sc.nextInt();

        if (N>M) {
            //N je 15, M je 10
            int x = N;
            N=M;
            M=x;
        }

        int suma = 0;

        int i = N;
        while (i<=M) {
            suma = suma + i;
            i++;
        }

        System.out.println("Suma je " + suma);

    }
}