package vezbe;

import java.util.Scanner;

public class vezbe6 {
    public static void main(String[] args) {
      //Učitati 3 pozitivna različita realna broja. Izračunati razliku najvećeg i najmanjeg, pa
        // tu razliku podijeliti sa srednjim od ta 3 broja. Konačni rezultat Ispisati na ekran.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite orvi broj");
        int x = sc.nextInt();
        System.out.println("Unesite drugi broj");
        int y = sc.nextInt();
        System.out.println("Unesite treci broj");
        int z = sc.nextInt();

        if(x>0 && y>0 && z>0) {

            int razlika1;
            double podeljenarazlika1;
            int razlika2 = (x-z);
            double podeljenarazlika2 = razlika2 - y;
            int razlika3 = y -z;
            if (x > y && x > z && y < z) {
                razlika1 = (x - y);
                podeljenarazlika1 = razlika1 / z;
                System.out.println("Razlika najveceg broja " + x + " i " + "najmanjeg " + y + "iznosi: " +
                        razlika1);
                System.out.println("Razlika podeljena sa trecim brojrm je " + podeljenarazlika1);

            } else if (x > z && y > z) {
                System.out.println("Razlika najveceg broja " + x + " i " + "najmanjeg " + z + "iznosi: " + razlika2);
            }

            else if(y>x && y >z && x<z) {

                System.out.println("Razlika najveceg i najmanjeg broja je " + razlika3);
            }
            else if(y>x && z<x && y>z){
                System.out.println("Razlika najveceg i najmanjeg broja je ");
            }






















        }





























    }
}
