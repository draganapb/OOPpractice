package vezbanjeTest;

import java.util.Scanner;

public class t5_domaci_FORpetlja {
    public static void main(String[] args) {

    /*    //1. Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel.

        Scanner sc = new Scanner(System.in);
        System.out.println("unesite broj");
        int x = sc.nextInt();
        int faktorijel = 1;

        for(int i = 1; i<x; i++){
            faktorijel = faktorijel * i;

        }
        System.out.println(faktorijel);*/

//2. Napraviti program gde unosite svoju godinu rodjenja i ispisati broj prestupnih godina
        // od vaseg rodjenja do tekuce godine.

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja");
        int rodjenje = sc.nextInt();
        //int starost = 2022-rodjenje;
        int brojac=0;

        for(int i = rodjenje; i<2022; i++){
            if(i%4==0){
                if(i%100==0||i%400!=0){
                    System.out.println(i);
                    brojac = brojac+1;

                }
            }

        }
        System.out.println(brojac);
*/

        // Napraviti program gde unosite 5 brojeva i uz poruku ispisati koji je bio najveci od svih njih. (edited)
        int broj;
        int maks = 0;

        Scanner sc = new Scanner(System.in);
      for(int i = 0; i<5; i++){
          System.out.println("Unesite broj");
           broj = sc.nextInt();

          if(i==0){
              maks=broj;
          }
          if(broj>maks){
                broj = maks;

          }


      }

        System.out.println(maks);

    }
}
