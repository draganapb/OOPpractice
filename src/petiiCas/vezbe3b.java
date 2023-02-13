package petiiCas;

import java.util.Scanner;

public class vezbe3b {
    public static void main(String[] args) {

        //Prikazati sumu izmedju N i M broja

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj N");
        int N = sc.nextInt();
        System.out.println("Unesite broj M");
        int M = sc.nextInt();

        if(N>M){
            int x =N;
            N=M;
            M=x;
        }
        int suma =0;
        int i = N;
        do{
            suma = suma + i;
            i++;
        }
        while(i<=M);
        System.out.println(suma);










    }

}
