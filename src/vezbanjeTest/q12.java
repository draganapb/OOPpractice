package vezbanjeTest;


import java.util.ArrayList;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        //Zadatak 44
//Napraviti dve liste top 5 tenisera i teniserki
//Kroz switch ako korisnik unese "ATP" onda unosi ime tenisera i vrsi se provera da li je u top 5
//Ako jeste ispisuje se poruka "Teniser je u top 5", ako nije ispisuje se "Teniser nije u top 5"
//Kroz switch ako korisnik unese "WTA" onda unosi ime teniserke i vrsi se provera da li je u top 5
//Ako jeste ispisuje se poruka "Teniserka je u top 5", ako nije ispisuje se "Teniserka nije u top 5"
//Kroz switch ako se ne unese "WTA" ili "ATP" ispisati "Pogresan unos"


        Scanner sc = new Scanner(System.in);
        String ime;
        ArrayList<String> ATP = new ArrayList<>();
        ArrayList<String>WTA = new ArrayList<>();

        ATP.add("Novak");
        ATP.add("Rodzer");
        ATP.add("Nadal");
        ATP.add("Agasi");
        ATP.add("Kecmanovic");

        WTA.add("Serena");
        WTA.add("Ana");
        WTA.add("Jelena");
        WTA.add("Olga");
        WTA.add("Milica");

        System.out.println("Unesite listu: ");
        String lista = sc.next();
        boolean nijeUTop5 = false;

        switch(lista){
            case "ATP":
                System.out.println("Unesite ime tenisera: ");
                ime = sc.next();

                for(int i = 0; i<ATP.size(); i++){
                    if(ime.equalsIgnoreCase(ATP.get(i))){
                        System.out.println("Top 5");
                        nijeUTop5 = false;
                        break;
                    }
                    else {
                        nijeUTop5 = true;
//                        System.out.println("nije je u top 5");
                    }

                }
                if(nijeUTop5){
                    System.out.println("Nije u top 5");

                }

        }










    }
}
