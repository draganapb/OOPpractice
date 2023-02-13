package drugiCas;

import java.util.Scanner;

public class VezbanjeDomaci4Switch {
    public static void main(String[] args) {
        //Napraviti program gde cete uneti svoju radnu poziciju,
        // mozete uneti "fizikalac", "inzenjer" i "masinovodja" i uneti svoju platu.
        // Ispisati u konzoli poziciju koju radis i platu.
        //Ako ste na poziciji fizikalca, povecati platu za 15%.
        //Ako ste na poziciji inzenjera, povecati platu za 20%.
        //Ako ste na poziciji masinovodje, povecati platu za 30%.
        //Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke.


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite svoju poziciju");
        String pozicija = sc.next();
        System.out.print("Unesite svoju platu");
        int plata = sc.nextInt();

        double povecanjeF = plata + (0.15*plata);
        double povecanjeI = plata + (0.20*plata);
        double povecanjeM = plata + (0.30*plata);

        if(plata>0) {



        switch (pozicija){

                case "fizikalac":

                    System.out.print("Povecana plata je " + povecanjeF);
                    break;

                case "inzenjer":

                    System.out.println("Vasa povecana plata je " + povecanjeI);
                    break;

                case "masinovodja":
                    System.out.println("Vasa povecana plata je " + povecanjeM);
                    break;

                default:
                    System.out.println("Neispravan unos");














        }

        }










    }
}
