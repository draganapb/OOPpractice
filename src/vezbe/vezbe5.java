package vezbe;

import java.util.Scanner;

public class vezbe5 {
    public static void main(String[] args) {
        //Zadatak 2
//Napisati program koji sabere cene dva broja i doda porez 20% na njih
//Resenje odstampati u konzoli

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        double x  = sc.nextDouble();
        System.out.println("Unesite drugi broj");
        double y = sc.nextDouble();
        double zbir= x+y;
        double porez = zbir+ (zbir/5);
        System.out.println("Cena s porezom je " + porez);







































    }
}
