package vezbanjeTest;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class listaDomaci {
    public static void main(String[] args) {
        // Napraviti proizvoljan niz brojeva, podeliti ih u dve liste,
        // jedna lista ce u sebi sadrzati sve parne brojeve dok ce druga lista zadrzati sve neparne brojeve.

     /*

     int niz [] = { 2,6,17,20,52,65,75,84,100};
        ArrayList parna = new ArrayList<>();
        for(int i = 0; i< niz.length; i++){
            if(niz[i]%2==0){
                parna.add(niz[i]);
            }
        }
        System.out.println(parna);

        ArrayList neparna = new ArrayList<>();
        for(int i =0; i< niz.length; i++){
            if(niz[i]%2!=0){
                neparna.add(niz[i]);
            }
        }

        System.out.println(neparna);

*/

        //Napraviti proizvoljnu listu imena, zatim uneti ime koje zelite da izbacite iz liste,
        // ispisati poruku u zavisnosti od toga da li je izbaceno ili ne, i da li se uopste nalazi u listi.

        ArrayList<String> ime = new ArrayList<>();
        ime.add("mika");
        ime.add("pera");
        ime.add("saki");
        ime.add("pera");
        ime.add("pera");

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime");
        String naziv = sc.next();

        for (int i = ime.size() - 1; i >= 0; i--) {
            if (ime.get(i).equals("pera")) {
                ime.remove(i);
            }
        }
        System.out.println(naziv + "uklonjeno");

        for (int i = ime.size() - 1; i >= 0; i--) {
            if(!(ime.get(i).equals("pera") || ime.get(i).equals("saki")|| ime.get(i).equals("mika"))){
                System.out.println("nepostojece");
            }
        }






        }

}

            //   if(!(ime.get(i).equals("pera")||ime.get(i).equals("saki")||ime.get(i).equals("mika"))){
            //       System.out.println("Ime se ne nalazi na listi");










