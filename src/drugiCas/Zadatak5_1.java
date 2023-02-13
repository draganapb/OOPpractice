package drugiCas;

import java.util.Scanner;

public class Zadatak5_1 {
    public static void main(String[] args) {

        //Zadatak 5 prof.nacin
//Korisnik unosi broj godina i stanje na racunu
//Ako korisnik ima izmedju 20 i 30 godina treba mu dodati jos 5000 na racun

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godine");
        int godine = sc.nextInt();
        System.out.println("Unesite stanje na racunu");
        int racun = sc.nextInt();
        //int novoStanje = racun;

        if (godine>=20 && godine<30) {
            //novoStanje = racun + 5000;
            racun = racun + 5000;

        }

        System.out.println("Stanje na racunu je " + racun);



    }
}