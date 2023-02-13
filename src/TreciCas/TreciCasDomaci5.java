package TreciCas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TreciCasDomaci5 {

    public static void main(String[] args) {

        //1. Napisati program gde cete uneti velicinu majice: 24( Ispise: S velicina), 30cm(Ispise: M Velicina),
        //36cm (ispise: L velicina), 42cm(ispise: XL velicina) u promptness izbaciti gresku o nepostojecoj velicini.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu majice u centimetrima:");
        int x = sc.nextInt();

        switch (x) {

            case 24: System.out.print("S velicina");
            break;

            case 30: System.out.println("M velicina");
            break;

            case 36: System.out.println("L velicina");
            break;

            case 42: System.out.println("XL velicina");
            break;

            default: System.out.println("Izabrali ste nepostojecu velicinu");







        }























































    }















}
