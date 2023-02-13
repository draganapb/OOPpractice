package vezbanjeTest;

import java.util.Scanner;

public class niz1 {
    public static void main(String[] args) {
    /*
        //Kreirati dva niza po 5 clanova

        //Drugi niz treba da ima duplo vece clanove od prvog niza

        int niz1 [] = {1, 4, 8, 9, 10};
        int niz2 [] =new int[5];

        for(int i =0; i < niz2.length; i++){
        niz2[i]=(niz1[i]) * 2;
        }

        for(int i = 0; i<niz2.length; i++){
            System.out.println(niz2[i]);
        }

        */


        //MOJA VERZIJA ZA NAJMANJI I NAJVECI BROJ U NIZU KAD UNOSIMO BROJEVE
        // Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
        // na kraju treba ispisati najveci broj I NAJMANJI BROJod onih koje smo uneli.

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Velicina niza");
        int velicinaNiza = sc.nextInt();
        int niz[] = new int[velicinaNiza];
        System.out.println("uneti clanove niza");
        for(int i=0; i<velicinaNiza; i++){
         niz[i]= sc.nextInt();
        }
        int max;
        int min;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        for(int i = 0; i<velicinaNiza; i++){
        if(i!=0){
                if(niz[i]>max){
                    max = niz[i];
              }
                if(niz[i]<min){
                    min = niz[i];
                    }
                }
            }
        System.out.println(max);
        }


*/

        //Napraviti NOVI niz brojeva, gde cete svaki neparan broj povecati za 2.

        int niz[] = {2,3,8,6,9};
        int niz1[] = new int[niz.length];
        for(int i = 0; i<niz.length; i++){
            if(niz[i]%2!=0){
                niz1[i] = niz[i]+2;
            }
            else{
                niz1[i] = niz[i];
            }
        }
        for(int i = 0; i<niz.length; i++) {
            System.out.println(niz1[i]);

        }

            //  for(int i = 0; i<niz.length; i++){

        }















    }
