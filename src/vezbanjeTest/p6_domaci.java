package vezbanjeTest;

import java.util.Scanner;

public class p6_domaci {
    public static void main(String[] args) {

/*
        //Napraviti program gde cete uneti neki broj i
        //kao rezultat vratiti zbir svih njegovih prethodnih brojeva. (napraviti sa for i while primere)

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int x = sc.nextInt();
        int suma = 0;
        int i = 0;
        while (i < x) {
            suma = suma + i;

            i++;
        }
        System.out.println(suma);

*/




        //Napraviti program gde cete uneti broj nekih knjiga na lageru,
        // zatim svaki put kada unesete '.' on ce skinuti po jednu knjigu sa lagera,
        //tek nakon sto unesete neki drugi string ili ponestaje knjiga na
        // lageru, izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
        //ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki
        // drugi String, onda samo ispisati stanje knjiga na lageru.


    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj knjiga: ");
        int lager = sc.nextInt();
        int brojac = 0;
        int stanje = lager - brojac;

        int i =0;
        while(i<lager){
            System.out.println("Unesite tacku");
            String tacka = sc.next();
            i++;
            if(tacka.equals(".")){
                brojac = brojac+1;
                stanje = lager - brojac;
            }
            System.out.println(stanje);

            if(!tacka.equals(".")){
                System.out.println(stanje);
            }

            if(stanje==0){
                System.out.println("nema");
            }
        }

        */




        //Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din,
// kruske 100 din i banane 140 din, tako da se suma
//racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo),
// toliko dodajemo na sumu, kada se unese ".",
//program izlazi iz petlje i pise ukupnu cenu navedenog voca.

//KADA RADIM SA WHILE TREBA DA NADJEM NACIN DA UDJEM U PETLJU
        Scanner sc = new Scanner(System.in);
       String voce="jabuka";
        int suma = 0;

       // int i = 0;
        while(voce.equals("jabuka")||voce.equals("banana")||voce.equals("kruska")){
           System.out.println("Unesite naziv voca");
            voce = sc.next();

        switch(voce){
                case "jabuka": suma = suma + 50;
                break;
                case "kruska": suma = suma + 100;
                break;
                case "banana": suma = suma + 140;
                break;

            }
            //System.out.println(suma);

        }
        if(voce.equals(".")) {
            System.out.println(suma);
        }











    }
}
