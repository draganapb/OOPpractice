package drugiCas;

import java.util.Scanner;

public class DrugiCas2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi ime");
        String ime = sc.next();

        if (ime.equals("Aca")) {
            System.out.println("Uneli ste ime Aca");
        }

        //-------------------

        boolean a = true;

        if (a) {
            //Kada u parametru prosledimo samo boolean onda se smatra da se poredi kao true vrednost
            //isto bi bilo kada bismo napisali if (a==true)
            System.out.println("Boolean je true");
        }

        System.out.println("Kraj programa");

    }
}