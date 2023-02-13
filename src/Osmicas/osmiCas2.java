package Osmicas;

import java.util.Scanner;

public class osmiCas2 {
    public static void main(String[] args) {
        //Zadatak 46 - Napraviti main metodu i dve metode tipa int.
// U jednoj metodi staviti fiksan return 10, a u drugoj uvesti skener i uneti neki broj.
// U main metodi treba pomnoziti ove dve metode

        System.out.println("Unesite drugi broj: ");
        int proizvod = broj1()*broj2();
        System.out.println("Proizvod je " + proizvod);
    }

    public static int broj1(){
        int prvi =10;
        return prvi;

    }
    public static int broj2(){
        Scanner sc = new Scanner(System.in);
        int drugi = sc.nextInt();
        return drugi;
    }
}
