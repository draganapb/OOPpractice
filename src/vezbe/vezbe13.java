package vezbe;

import java.util.Scanner;

public class vezbe13 {
    public static void main(String[] args) {

        //Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din,
// kruske 100 din i banane 140 din, tako da se suma
//racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo),
// toliko dodajemo na sumu, kada se unese ".",
//program izlazi iz petlje i pise ukupnu cenu navedenog voca.
Scanner sc = new Scanner(System.in);
        String voce="";
        int i = 0;
        while(!voce.equals(".")){
            System.out.println("Unesite naziv voca: ");
             voce = sc.next();
            int suma = 0;

            switch(voce){
                case "jabuka": suma = suma + 50;
                    break;

                case "kruska": suma = suma + 100;
                    break;
                case "banana": suma = suma + 140;
                    break;
            }
        }








    }
}
