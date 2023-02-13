package TreciCas;

import java.util.Scanner;

public class vezbanje_domaci {
    public static void main(String[] args) {

       // Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi)
        // nakon toga, uneti neku godinu izdanja knjige, ukoliko su Triler i Romantika
        //starija od 30 godina, onda treba ispisati poruku da zanr knjige vise nije na lageru,
        // takodje ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina,
        //ukoliko zanr nije stariji od ogranicenja, ispisati poruku da je zanr knjige na lageru.
        //......20k....rt30.........h40.....


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite zanr knjige: ");
        String zanr = sc.next();
        System.out.println("Unesite godinu izdanja: ");
        int izdanje = sc.nextInt();
        int starost = 2022 - izdanje;

        if(izdanje<=2022 && izdanje>0) {

            switch (zanr.toLowerCase()) {

                case "romantika", "triler":
                    if (starost >= 30) {
                        System.out.println(zanr + " nije vise na lageru");
                    } else {
                        System.out.println(zanr + "je na lageru");
                    }
                break;

                case "horor":
                    if (starost > 40) {
                        System.out.println(zanr + "nije vise na lageru");
                    } else {
                        System.out.println(zanr + "je na lageru");
                    }
                    break;


                case "krimi":
                    if (starost > 20) {

                        System.out.println(zanr + "nije na lageru");
                    } else {
                        System.out.println(zanr + " je na lageru");
                    }
                    break;


            }

        }
        else{System.out.println("Neispravan unos godine");}






























    }
}
