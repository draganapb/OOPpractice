package petiiCas;

import java.util.Scanner;

public class vezbe3 {
    public static void main(String[] args) {
        //Prikazati sumu izmedju N i M broja
//Zadatak uraditi sa sve tri petlje odvojeno (moze i u razlicite klase svaka petlja)

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj N");
        int N = sc.nextInt();
        System.out.println("Unesite broj M");
        int M = sc.nextInt();
        int suma =0;
        int x=N;

        x = N;
        if(N>M) {
             x = N;
            N = M;
            M = N;
        }
        while(x<M){
            suma = suma +x;
            x++;
        }
        System.out.println(suma);










    }
}
