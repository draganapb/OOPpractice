package dopunska;

import java.util.Scanner;

public class dop2 {
    public static void main(String []  arg) {

        int[] brojevi = {5,2,1,4,5,9,2};

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();

        int[] nov = new int[brojevi.length];

        for(int i=0; i<brojevi.length; i++) {
            if(broj<brojevi[i]) {
                nov[i] = brojevi[i];
            } else {
                continue;
            }
            System.out.println(nov[i]);
        }
    }
}