package SestiCas;

import java.util.Scanner;

public class SestiCas9_zadatak {
    public static void main(String[] args) {

//Zadatak 31
//Preko skenera uneti velicinu niza, zatim preko skenera uneti sve clanove
//Odstampati samo parne brojeve u nizu
//OVO JE DRAGOLJUBOVA VARIJANTA, NE FUNKCIONISE, ISPOD JE MOJA VERZIJA
    /*   Scanner sc = new Scanner(System.in);

        System.out.println("Uneti velicinu niza");

        int velicinaNiza = sc.nextInt();
        System.out.println("Unesite sve clanove niza");
        int niz[] = new int[sc.nextInt()];

        for (int i = 0; i < velicinaNiza; i++) {
            niz[i] = sc.nextInt();
        }
        for (int i = 0; i < velicinaNiza; i++) {
            if (niz[i] % 2 == 0) {
                System.out.println("paran"+ niz[i]);
            }

        }*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Uneti velicinu niza");

        int velicinaNiza = sc.nextInt();
        System.out.println("Unesite sve clanove niza");
        int[] niz = new int[velicinaNiza];

        for (int i = 0; i < velicinaNiza; i++) {

            niz[i] = sc.nextInt();
        }
        for (int i = 0; i < velicinaNiza; i++) {
            if (niz[i] % 2 == 0) {
                System.out.println("paran"+ niz[i]);
            }

        }




    }
}