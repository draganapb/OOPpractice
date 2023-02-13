package TreciCas;

import java.util.Scanner;

public class TreciCasSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj od 1 do 3");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("Uneli ste broj 1");
                break;

            case 2:
                System.out.println("Uneli ste broj 2");
                break;

            case 3:
                System.out.println("Uneli ste broj 3");
                break;

            default:
                System.out.println("Niste uneli broj od 1 do 3");
                break;
        }

        if (x==1) {
            System.out.println("Uneli ste broj 1");
        } else if (x==2) {
            System.out.println("Uneli ste broj 2");
        } else if (x==3) {
            System.out.println("Uneli ste broj 3");
        } else {
            System.out.println("Niste uneli broj od 1 do 3");
        }

        //----------------------

        System.out.println("Unesite ime Marko ili Ana");
        String rec = sc.next();

        switch (rec) {
            case "Marko":
                System.out.println("Uneli ste ime Marko");
                break;

            case "Ana":
                System.out.println("Uneli ste ime Ana");
                break;

            default:
                System.out.println("Niste uneli ime Marko ili Ana");
                break;
        }





    }
}