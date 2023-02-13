package TreciCas;

import java.util.Scanner;

public class TreciCasZadatak5 {
    public static void main(String[] args) {

//Zadatak 13
//Preko skenera unosite tri broja
//Prvi broj komanduje koja akcija ce se raditi u switchu (1 - sabiranje, 2 - oduzimanje, 3 - mnozenje)
//Zavisno koja komanda se izabere ta akcija treba da se izvrsi nad druga dva unosa
//Napomena: Ako se radi oduzimanje treba oduzeti veci broj od manjeg

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj 1, 2 ili 3");
        int x = sc.nextInt();
        System.out.println("Unesite drugi broj");
        double y = sc.nextDouble();
        System.out.println("Unesite treci broj");
        double z = sc.nextDouble();

        switch (x) {
            case 1:
                System.out.println("Zbir je " + (y + z));
                break;

            case 2:
                if (x >= z) {
                    System.out.println("Razlika je " + (y - z));
                }
                else    {
                    System.out.println("Razlika je " + (z-y));


                }
            break;



            case 3: System.out.println("Proizvod je " + ( z * y));
                    break;










        }
    }
}