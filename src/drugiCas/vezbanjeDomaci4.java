package drugiCas;

import java.util.Scanner;

public class vezbanjeDomaci4 {
    public static void main(String[] args) {


        //Napraviti program gde cete uneti svoju radnu poziciju,
        // mozete uneti "fizikalac", "inzenjer" i "masinovodja" i uneti svoju platu.
        // Ispisati u konzoli poziciju koju radis i platu.
        //Ako ste na poziciji fizikalca, povecati platu za 15%.
        //Ako ste na poziciji inzenjera, povecati platu za 20%.
        //Ako ste na poziciji masinovodje, povecati platu za 30%.
        //Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke.


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv svoje pozicije");
        String pozicija = sc.next();;
        System.out.println("Unesite vasu platu");
        int plata = sc.nextInt();

        double povecanjeF = plata + (plata*0.15);
        double povecanjeI = plata + (plata*0.2);
        double povecanjeM = plata + (plata*0.3);

        if(plata>0) {


            if (pozicija.equalsIgnoreCase("fizikalac")) {
                System.out.println("Vasa plata trenutno iznosi " + povecanjeF);
            } else if (pozicija.equalsIgnoreCase("inzenjer")) {

                System.out.println("Vasa plata trenutno iznosi " + povecanjeI);
            } else if (pozicija.equalsIgnoreCase("masinovodja")) {
                System.out.println("Vasa plata trenutno iznosi " + povecanjeM);
            }
            else {
                System.out.println("Pogresni podaci");
            }
        }



























    }
}
