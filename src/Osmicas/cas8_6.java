package Osmicas;

import java.util.Scanner;

public class cas8_6 {
    public static void main(String[] args) {

                //Kako da biramo da li ce metoda biti void ili da ima tip?
                //Ako cemo da radimo nesto sa resenjem metode onda mora da ima tip
                //Kao za ovaj primer ako cemo da pravimo bilo kakvu interakciju izmedju metoda onda one moraju imati return
                int zbir = broj1() + broj2();
                System.out.println(zbir);

                //Void metode mozemo samo da pozivamo
            }

            public static int broj1() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Unesite neki broj");
                int broj = sc.nextInt();
                return broj;
            }

            public static int broj2() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Unesite neki broj");
                int broj = sc.nextInt();
                return broj;

                //Ako deklarisem promenljive u ovoj metodi onda ce biti vidljive samo u njoj
                //Sto znaci da promenljive mogu da imenujem isto u svakoj posebnoj metodi
                //Kao sto smo uradili sa ove dve metode
            }
        }
