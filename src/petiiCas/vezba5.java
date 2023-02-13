package petiiCas;

import java.util.Scanner;

public class vezba5 {
    public static void main(String[] args) {


        // Unositi brojeve sve dok se ne unesu dva ista broja za redom
/*Scanner sc = new Scanner(System.in);
            int broj = 0;
            int y;

        while(true){
            System.out.println("Unesite broj");

            y=broj;

            broj = sc.nextInt();

            if(broj==y){
                break;
            }
        }
*/



Scanner sc = new Scanner (System.in);
        System.out.println("Unesi brok");
        int broj = sc.nextInt();
        int y;
        do{ y = broj;
            broj = sc.nextInt();

        }
while(broj!=y);







    }

}
