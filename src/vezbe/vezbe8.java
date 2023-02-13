package vezbe;

import java.util.Scanner;

public class vezbe8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vasu ocenu");
        int ocena = sc.nextInt();

        switch(ocena){

            case 1:
                System.out.println("Nedovoljan");

            break;

            case 2:
                System.out.println("Dovoljan");
                break;

            case 3:
                System.out.println("Dobar");
            break;

            case 4:
                System.out.println("Vrlodobar");
            break;

            case 5:
                System.out.println("Odlican");
            default:
                System.out.println("Uneli ste pogresnu ocenu");
        }




















    }
}
