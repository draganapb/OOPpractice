package drugiCas;

import java.util.Scanner;

public class v {
    public static void main(String[] args) {

//

   //   /Prikazati sumu izmedju N i M broja
//Zadatak uraditi sa sve tri petlje odvojeno (moze i u razlicite klase svaka petlja)//


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite N:");
        int N = sc.nextInt();
        System.out.println("Unesite M");
        int M = sc.nextInt();
        int veci, manji;
        int suma = 0;
        if(N>M){
            veci = N;
            manji = M;
        }else{
            veci = M;
            manji = N;
        }

      /*for(int i = manji; i<veci; i++){

            suma = suma + i;
        }
        System.out.println(suma);

*/


     /*        int i =manji;
             while(i<veci){

                suma = suma + i;
                i++;
        }

        System.out.println(suma);
             */
             int i =manji;
             do{
                 suma = suma + i;
                 i++;
             }
             while(i < veci);
        System.out.println(suma);









    }
}








