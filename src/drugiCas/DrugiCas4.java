package drugiCas;

import java.util.Scanner;

public class DrugiCas4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int x = sc.nextInt();

        if (x > 0 && x < 10) {
            System.out.println("Broj je jednocifren");
        } else if (x>=10 && x <100){
            System.out.println("Broj je dvocifren");
        } else if (x>=100 && x < 1000) {
            System.out.println("Broj je trocifren");
        } else if (x>=1000) {
            System.out.println("Broj je veci ili jednak 1000");
        } else if (x==0) {
            System.out.println("Uneli ste nulu");
        } else {
            System.out.println("Broj je negativan");
        }

        //-----------0--------------10------------100-------------1000-----------

        if (x > 0 && x < 10) {
            System.out.println("Broj je jednocifren");
            if (x%2==0) {
                System.out.println("I broj je paran");
            } else {
                System.out.println("I broj je neparan");
            }
        } else if (x>=10 && x <100){
            System.out.println("Broj je dvocifren");
            if (x%2==0) {
                System.out.println("I broj je paran");
            } else {
                System.out.println("I broj je neparan");
            }
        } else if (x>=100 && x < 1000) {
            System.out.println("Broj je trocifren");
            if (x%2==0) {
                System.out.println("I broj je paran");
            } else {
                System.out.println("I broj je neparan");
            }
        } else if (x>=1000) {
            System.out.println("Broj je veci ili jednak 1000");
            if (x%2==0) {
                System.out.println("I broj je paran");
            } else {
                System.out.println("I broj je neparan");
            }
        } else if (x==0) {
            System.out.println("Uneli ste nulu");
            if (x%2==0) {
                System.out.println("I broj je paran");
            } else {
                System.out.println("I broj je neparan");
            }
        } else {
            System.out.println("Broj je negativan");
            if (x%2==0) {
                System.out.println("I broj je paran");
            } else {
                System.out.println("I broj je neparan");
            }
        }
    }
}