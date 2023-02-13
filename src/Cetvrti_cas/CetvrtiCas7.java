package Cetvrti_cas;

import java.util.Scanner;

public class CetvrtiCas7 {
    public static void main(String[] args) {
        //Zadatak 19
//Prikazati sumu brojeva do broja N koji unosite preko skenera

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj");
        int N = sc.nextInt();
        int suma = 0;

        for(int i = 0; i<=N; i++){
            suma= suma + i;

        }
        System.out.println("Zbir brojeva do " + N + "je"+ suma);







    }
}
