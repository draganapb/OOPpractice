package petiiCas;

import java.util.Scanner;

public class petiiCas3 {
    public static void main(String[] args) {

        //Stampaj brojeve dok korisnik ne unese negativan broj

        //Mi ne znamo koliko puta ce petlja da se izvrsi i zato koristimo WHILE petlju

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi pozitivan broj");
        int x = sc.nextInt();
        while (x > 0) {
            System.out.println("Uneli ste broj " + x);
            System.out.println("Unesi ponovo pozitivan broj");
            x = sc.nextInt();
        }

        System.out.println("Kraj programa");

    }
}