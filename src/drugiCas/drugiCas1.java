package drugiCas;

import java.util.Scanner;

public class drugiCas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi neki broj");
        int x = sc.nextInt();

        if (x>0) {
            System.out.println("Uneli ste pozitivan broj");
        }

        if (x==0) {
            System.out.println("Uneli ste nulu");
        }

        if (x<0) {
            System.out.println("Uneli ste negativan broj");
        }

        System.out.println("Kraj programa");

    }

}