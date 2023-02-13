package Osmicas;

import java.util.Scanner;

public class osmicas4 {
    public static void main(String[] args) {
        //Zadatak 48 - U main metodi preko skenera uneti dva broja
//Napraviti metodu koja ce da sabira, oduzima, mnozi i deli te brojeve
        System.out.println("Unesite dva broja");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
       // sabiranje()(x,y);
        System.out.println("Zbir brojeva je " + sabiranje(x,y));
        System.out.println("Razlika brojeva je " + oduzimanje(x,y));
        System.out.println("Proizvod brojeva je " + mnozenje(x,y));
        System.out.println("Kolicnik brojeva je " + deljenje(x,y));

    }

        public static int sabiranje(int a, int b){
        int zbir = a+b;
        return zbir;
        }

        public static int oduzimanje(int a, int b){
          int razlika = 0;
        if (a > b) {
                 razlika = a-b;

            }
            else {
                razlika = b-a;

            }

           return razlika;
        }
        public static int mnozenje(int a, int b){
        int proizvod = a*b;
        return proizvod;
        }

        public static double deljenje(int a, int b){

        double deljenje = a/b;
        return deljenje;
        }

}
