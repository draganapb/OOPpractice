package vezbe;

import java.util.Scanner;

public class vezba3 {
    public static void main(String[] args) {
        //Napisati program da provjeriti da li je upisani broj pozitivan, negativan ili nula i to ispiše.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        double x = sc.nextDouble();

        if (x > 0) {
            System.out.println("Broj je pozitivan");
        }
        else if(x == 0){
            System.out.println("Broj je nula");
        }
        else {
            System.out.println("Broj je negativan");
        }




    }
}
