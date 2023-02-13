package vezbanjeTest;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
//                 //Napisati program koji ce proveriti da li je broj dvocifren i paran
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int x = sc.nextInt();

        if(x>=10 && x<100){
            if(x%2==0){
                System.out.println("Broj je dvocifren  i paran");
            }

            else{
                System.out.println("Broj je dvocifren  i neparan");
            }
        }
        else{
            if(x%2==0){
                System.out.println("Broj nije dvocifren i paran je");
            }

            else{
                System.out.println("Birj nije dvocifren i neparan je");
            }
        }





    }
}
