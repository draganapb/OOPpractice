package drugiCas;

import java.util.Scanner;

public class vezba_domaci4 {
    public static void main(String[] args) {
        //Napraviti program gde cete uneti svoju radnu poziciju,
        // mozete uneti "fizikalac", "inzenjer" i "masinovodja" i uneti svoju platu.
        // Ispisati u konzoli poziciju koju radis i platu.
        //Ako ste na poziciji fizikalca, povecati platu za 15%.
        //Ako ste na poziciji inzenjera, povecati platu za 20%.
        //Ako ste na poziciji masinovodje, povecati platu za 30%.
        //Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke.


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite svoju poziciju: ");
        String pozicija = sc.next();

        System.out.println("Unesite svoju platu");

        double plata = sc.nextDouble();

        if (pozicija.equalsIgnoreCase("fizikalac") && plata > 0)
        {
            plata = plata + (plata * 0.15);
            System.out.println("Ja sam " + pozicija + " i moja plata je " + plata);
        } else if (pozicija.equalsIgnoreCase("inzenjer" )&& plata > 0) {
            plata = plata + (plata * 0.2);
            System.out.println(" Ja sam " + pozicija + "i moja plata je " + plata);
        }
          else if(pozicija.equalsIgnoreCase("masinovodja") && plata > 0)
        {    plata = plata + (plata * 0.3);
            System.out.println("Ja sam " +  pozicija + " i moja plata je " + plata);
        }

        // else if(plata<0){
        // System.out.println("negativan unos" + plata);
       // else


       // System.out.println(" Pogresan unos");

        else{
            System.out.println("Neispravan unos");
    }






    }


}




