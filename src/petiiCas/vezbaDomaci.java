package petiiCas;

import java.util.Scanner;

public class vezbaDomaci {
    public static void main(String[] args) {
        //Napraviti program gde cete uneti neki broj i
        //kao rezultat vratiti zbir svih njegovih prethodnih brojeva. (napraviti sa for i while primere)

       Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj = sc.nextInt();
        int suma=0;

        for(int i=0; i<broj; i++){
            suma = suma + i;
        }
        System.out.println(suma);



/*       System.out.println("Unesite broj");
        int broj = sc.nextInt();
        int suma = 0;

        int i = 0;
        while(i<broj){
            System.out.println(i);

            suma = suma + i;
            i = i + 1;

        }
        System.out.println(suma);
*/


    }
}
