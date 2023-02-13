package vezbe;

import java.util.Scanner;

public class vezbe7 {
    public static void main(String[] args) {


        //Zavisno o upisanoj vrijednosti časa 0-23 ispisati poruku:
        //0-8 dobro jutro, 9-18 dobar dan, 19-23-dobro vece

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko je casova");
        int cas = sc.nextInt();

        if(cas<24 && cas>=0){

            if( cas<9){
                System.out.println("Dobro jutro!");
            }
            else if(cas< 19){
                System.out.println("Dobar dan");
            }
            else {
                System.out.println("Dobro vece");
            }


        }


            else{
            System.out.println("Uneli ste nevazeci broj casova");
        }

































    }
}
