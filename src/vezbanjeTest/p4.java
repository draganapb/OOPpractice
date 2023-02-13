package vezbanjeTest;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        // Unositi brojeve sve dok se ne unesu dva ista broja za redom

    /*

      Scanner sc = new Scanner(System.in);

        System.out.println("unesi broj");

        int x = sc.nextInt();
        int y;

        while(true){
          System.out.println("unesi broj");
            y=x;
            x = sc.nextInt();

          if(x==y){
              break;
          }
          
      }



*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int x = sc.nextInt();
        int y = 0;
        while(x!=y){
            y=x;
            System.out.println("Unesite broj");
            x = sc.nextInt();
            y=x;

        }









    }
}
