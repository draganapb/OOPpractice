package TreciCas;

import java.util.Scanner;

public class vezbanje {

    public static void main(String[] args) {
      //  Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi)
        // nakon toga, uneti neku godinu izdanja knjige, ukoliko su Triler i Romantika
        //starija od 30 godina, onda treba ispisati poruku da zanr knjige vise nije na lageru,
        // takodje ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina,
        //ukoliko zanr nije stariji od ogranicenja, ispisati poruku da je zanr knjige na lageru.
        //......20k....rt30.........h40.....

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite zanr");
        String zanr = sc.next();
        System.out.println("Unesite godinu izdanja");
        int godina = sc.nextInt();
        int starost = 2022-godina;

        if(zanr.equalsIgnoreCase("krimi")&& starost>20){
            System.out.println("Knjiga je na lageru");
        }
        else if(zanr.equalsIgnoreCase("romantika")|| zanr.equalsIgnoreCase("triler")&& starost >30)
        {
            System.out.println("Knjiga je na lageru");
        }
        else if (zanr.equalsIgnoreCase("horor")&& starost>40){
            System.out.println("Knjiga je na lageru");
        }
        else{
            System.out.println("Knjiga nije na lageru");
        }






















    }
}
