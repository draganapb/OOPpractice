package vezbanjeTest;

import java.util.Scanner;

public class p3_1 {
    public static void main(String[] args) {

        /*

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite pin");
        int pin = sc.nextInt();

        do{
            System.out.println("Unesite pin");
            pin = sc.nextInt();
        }
        while(pin!=1234);
*/


     /*   Scanner sc = new Scanner(System.in);

        System.out.println("Unesite pin");
        int pin = sc.nextInt();

        while(true){
            System.out.println("Unesite pin");
             pin = sc.nextInt();
            pin++;

             }
    }
*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite pin");
        int pin = sc.nextInt();
        while(pin!=123){
            System.out.println("Unesite pin");
            pin = sc.nextInt();
        }


    }
}
