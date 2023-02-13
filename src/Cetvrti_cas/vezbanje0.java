package Cetvrti_cas;

import java.util.Scanner;

public class vezbanje0 {
    public static void main(String[] args) {
        //Napisati program koji ce proveriti da li je broj dvocifren i paran

/*Scanner sc = new Scanner(System.in);
        System.out.println("Broj unesi");
        int x = sc.nextInt();
               if (x>=10 && x<100) {
                   if (x % 2 == 0) {
                       System.out.println("Dvocifren i paran");
                   }
                   else{
                       System.out.println("Dvocifren i neparan");
                   }
               }
                else{
                    if(x%2==0){
                        System.out.println("Nije dvocifren i paran je");
                    }
                    else{
                        System.out.println("nije dvocifren i neparan je");
                    }
               }
*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
            int x = sc.nextInt();
            int faktorijel = 1;

            for(int i = 1; i<=x; i++){
                faktorijel = faktorijel*i;

            }
        System.out.println(faktorijel);*/


        //2. Napraviti program gde unosite svoju godinu rodjenja i ispisati broj prestupnih godina
        // od vaseg rodjenja do tekuce godine.


       /* Scanner sc = new Scanner(System.in);
        System.out.println("unesite godinu rodjenja");
        int rodjenje = sc.nextInt();
        int trenutna = 2022;
        int broj = 2022-rodjenje;
        int brojac = 0;
        for(int i = rodjenje; i <= 2022; i++){
            if (i % 4 == 0 || i % 100 ==0) {
                brojac = brojac + 1;
                System.out.println(i);
            }

        }
        System.out.println(brojac);
*/

        // Napraviti program gde unosite 5 brojeva i uz poruku ispisati koji je bio najveci od svih njih. (edited)




/*Scanner sc = new Scanner(System.in);
int x;


int max = 0;

for(int i = 0; i<5; i--){
    System.out.println("Unesite broj");
    x = sc.nextInt();
    if (i == 0) {
        max = x;
    }
    if (x > max) {
        max = x;
    }
    System.out.println(i);

}


        System.out.println(max);*/

//Zadatak 21
//Uneti 5 pozitivnih brojeva preko skenera i pronaci najveci

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int max = 0;
        int x;

        for (int i = 0; i < 5; i++) {
            x = sc.nextInt();
            if (x > 0) {
                if (x == 0) {
                    max = x;
                }
            } else {
                System.out.println("negativan");

                }
            if(x>max){
                max=x;
            }
        }
        System.out.println("maks je " + max);

    }

    }





























