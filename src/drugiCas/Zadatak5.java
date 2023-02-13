package drugiCas;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {


        //Zadatak 5 moj nacin
        //Korisnik unosi broj godina i stanje na racunu
        //Ako korisnik ima izmedju 20 i 30 godina treba mu dodati jos 5000 na racun
    Scanner sc = new Scanner(System.in);

    System.out.println(" Unesite broj godina: ");
    int godina = sc.nextInt();

    System.out.println(" Unesite stanje na vasem racunu: ");
    int stanje = sc.nextInt();
    int racun = stanje + 5000;

    if(godina>=20 && godina < 30){
        System.out.println(" Stanje na vasem racunu je: " + racun);
    }
    else {
        System.out.println("Stanje na vasem racunu je: " + stanje);


    }





    }


















}



