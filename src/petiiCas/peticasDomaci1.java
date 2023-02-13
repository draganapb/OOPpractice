package petiiCas;

import java.util.Scanner;

public class peticasDomaci1 {
    public static void main(String[] args) {
        //Napraviti program gde cete uneti neki broj i
        //kao rezultat vratiti zbir svih njegovih prethodnih brojeva. (napraviti sa for i while primere)


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();
        int suma = 0;
        int i = 0;
        while(i<broj){
            suma = suma + i;
            i++;
        }
        System.out.println(suma);



      /* Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();
        int suma = 0;

        for( int i = 0; i<broj; i++){
            suma = suma + i;
        }
        System.out.println(suma);   */
    }

}
