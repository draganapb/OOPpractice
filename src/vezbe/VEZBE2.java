package vezbe;

import java.util.Scanner;

public class VEZBE2 {
    public static void main(String[] args) {
        //y = a+b ako je a parno, a b neparno,
       // y = a*b za ostale slucajeve

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite orvi broj");
        int a = sc.nextInt();
        System.out.println("Unesite drugi broj");
        int b = sc.nextInt();

        if(a % 2==0 && b % 2 !=0){
            System.out.println("Y= " + (a + b));
        }
        else {
            System.out.println("y = " + (a * b));
        }





    }
}
