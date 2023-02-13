package vezbe;

import java.util.Scanner;

public class vezbe1 {
    public static void main(String[] args) {

        //Na ekranu ispisati "Otkucajte nadimak pjesnika Jovana Jovanovica". Ako se otkuca Zmaj ili ZMAJ
        // ispisati "ODLICNO", inače na druge odgrovore ispisati  "ISPRAVAN ODGOVOR JE ZMAJ".


        Scanner sc = new Scanner(System.in);
        System.out.println("Otkucajte nadimak pesnika Jovana Jovanovica");
        String nadimak = sc.next();


        if(nadimak.equalsIgnoreCase("zmaj")) {
            System.out.println("Odlicno");
        }
        else{
            System.out.println("Netacan odgovor");
        }















    }
}
