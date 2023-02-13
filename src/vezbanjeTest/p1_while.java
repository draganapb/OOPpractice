package vezbanjeTest;

import java.util.Scanner;

public class p1_while {
    public static void main(String[] args) {

//Koristeci WHILE petlju napraviti program koji racuna profit prethodnih dana preko unetih brojeva
// sve dok korisnik ne unese 0


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Unesite profit dana");
        int profit = sc.nextInt();
        int suma = 0;
        while(profit!=0){
            System.out.println("Unesite profit dana");
            profit = sc.nextInt();
            suma = suma + profit;

        }
        System.out.println(suma);

*/
   /*     Scanner sc = new Scanner(System.in);
        int suma = 0;
        while(true){
            System.out.println("Unesite profit dana");
            int profit = sc.nextInt();
             if(profit==0){
                 break;
             }
             suma=suma+profit;

        }
        System.out.println(suma);
*/

Scanner sc = new Scanner(System.in);
        int profit = sc.nextInt();
        int suma = 0;
for(int i = 1; i>0;i++){
    System.out.println("Unesite profit");
    profit = sc.nextInt();
    if(profit!=0){
        break;
    }
    suma = suma + profit;

}
        System.out.println(suma);







    }
}

