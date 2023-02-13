package vezbanjeTest;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        //Prikazati sumu izmedju N i M broja
//Zadatak uraditi sa sve tri petlje odvojeno (moze i u razlicite klase svaka petlja)

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj N: ");
        int N = sc.nextInt();
        System.out.println("Unesite broj M: ");
        int M = sc.nextInt();
        int suma = 0;

        for(int i = N; i<M; i++){
            suma = suma + i;
        }
        System.out.println(suma);

*/
   /*     Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj N: ");
        int N = sc.nextInt();
        System.out.println("Unesite broj M: ");
        int M = sc.nextInt();
        int suma = 0;
        int i =N;
        while(i<M){
            suma = suma + i;
            i++;
        }

        System.out.println(suma);
*/



     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj N: ");
        int N = sc.nextInt();
        System.out.println("Unesite broj M: ");
        int M = sc.nextInt();
        int suma = 0;
        int manjiBroj, veciBroj;
        if(M>N){
            veciBroj=M;
            manjiBroj=N;
        }
        else{veciBroj=N;
            manjiBroj=M;

        }
        int i = manjiBroj;

        do {
            suma = suma + i;
            i++;
        }
        while (i<veciBroj);
        System.out.println(suma);


*/



   /*     Scanner sc = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int N = sc.nextInt();
        System.out.println("Unesite M:" );
        int M = sc.nextInt();
        int suma = 0;
        int manjiBroj, veciBroj;
        if(N>M){
            manjiBroj=M;
            veciBroj=N;
        }
        else{
            manjiBroj=N;
            veciBroj = M;
        }
        for(int i = manjiBroj; i<veciBroj; i++){
            suma = suma + i;
        }
        System.out.println(suma);


    */


      /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int N = sc.nextInt();
        System.out.println("Unesite M:" );
        int M = sc.nextInt();
        int suma = 0;
        int manji, veci;
        if (N > M){
            manji = M;
            veci = N;
        }
        else{
            manji = N;
            veci=M;
        }
        int i = manji;

        while(i<veci){

            suma = suma + i;
            i++;

        }
        System.out.println(suma);
        */


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int N = sc.nextInt();
        System.out.println("Unesite M:" );
        int M = sc.nextInt();
        int suma = 0;
        int manji, veci;
        if (N > M){
            manji = M;
            veci = N;
        }
        else{
            manji = N;
            veci=M;
        }
        int i = manji;
        do{
            suma = suma + i;
            i++;
        }
        while(i<veci);

        System.out.println(suma);


    }

}
