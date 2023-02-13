package SestiCas;

import java.util.Scanner;

public class sestiCasDOMACI1 {
    public static void main(String[] args) {
        //
        //Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
        // na kraju treba ispisati najveci broj od onih koje smo uneli.

        Scanner sc = new Scanner(System.in);

        System.out.println("Uneti velicinu niza");

        int velicinaNiza = sc.nextInt();

        int[] niz = new int[velicinaNiza];

        System.out.println("Unesite sve clanove niza");

        for (int i = 0; i < velicinaNiza; i++) {

            niz[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < velicinaNiza; i++) {
               if(i==0){
                    max = niz[i];
                }
                 if (niz[i]>max){
                    max=niz[i];

        }

    }
        System.out.println("Najveci clan niza je " +max);

    }

    }