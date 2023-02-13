import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //Zadatak 3
//Preko skenera uneti dva broja i odstampati aritmeticku sredinu dva uneta broja

        Scanner test = new Scanner(System.in);


                                                            //moze i:  double x,y;
        System.out.println("Unesite prvi broj: ");
        double x = test.nextDouble();
        System.out.println("Uneli ste broj: " + x);

        System.out.println("Unesite drugi broj: ");
        double y = test.nextDouble();
        System.out.println("Uneli ste broj: " + y);

        System.out.println("Aritmeticka sredina dva broja je: " + (x+y)/2);


    }
}
