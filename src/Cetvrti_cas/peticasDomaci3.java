package Cetvrti_cas;

import java.util.Scanner;

public class peticasDomaci3 {
    public static void main(String[] args) {
//Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din,
// kruske 100 din i banane 140 din, tako da se suma
//racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo),
// toliko dodajemo na sumu, kada se unese ".",
//program izlazi iz petlje i pise ukupnu cenu navedenog voca.


Scanner sc = new Scanner (System.in);
        int suma = 0;
        String voce;
        while(true) {
            System.out.println("Unesite voce");
            voce = sc.next();

            switch(voce){
                case "jabuka": suma = suma + 50;
                break;
                case "kruska": suma = suma + 100;
                break;
                case "banana": suma = suma + 140;
                break;
            }

            if(voce.equals(".")){
                System.out.println(suma);
                break;
            }


            System.out.println(suma);
        }

/* sa WHILE PETLJOM


        Scanner sc=new Scanner(System.in);
        String voce="jabuka";
        int suma = 0;
        while(voce.equals("jabuka") || voce.equals("banana") || voce.equals("kruska")){
            System.out.println("Uneti naziv voca: ");
            voce = sc.next();
            switch(voce){
                case "jabuka": suma = suma +50;
                break;
                case "kruska": suma = suma +140;
                break;
                case "banana": suma = suma +200;
                break;
            }
            System.out.println(suma);
        }




 */




    }
}
