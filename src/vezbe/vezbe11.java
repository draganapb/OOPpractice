package vezbe;

import java.util.Scanner;

public class vezbe11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int x = sc.nextInt();



        if (x > 0 && x < 10) {
            System.out.print("Broj je jednocifren");

            if (x % 2 == 0) {
                System.out.print("i paran");
            } else {
                System.out.print("i neparan");
            }
        }


            else if (x > 9 && x < 100) {
                System.out.println("Broj je dvocifren");
                if (x % 2 == 0) {
                    System.out.println("i paran");
                } else {
                    System.out.println("i neparan");
                }

            }

        else if(x>99 & x<1000){
            System.out.println("broj je trocifren");
            if(x%2==0){
                System.out.println("i paran");
            }
            else{
                System.out.println("i neparan");
            }}

             else if(x>999){
                System.out.println("broj je cetvorocifren");
                if(x%2==0){
                    System.out.println("i paran");
                }
                else{
                    System.out.println("i neparan");
                }






        }

        else {
            System.out.println("Broj je manji od nule");
        }




    }
}
