package Osmicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Domaci2 {



    public static void main(String[] args) {
       // Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0. Zatim cete uneti
      //  neki broj, pomocu metode napraviti novu listu koja ce u sebi
      //  sadrzati sve brojeve vece od unetog broja. Novu listu pozvati pomocu metode za stampanje elemenata liste


        ArrayList<Integer>lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int clan_liste = 1;

        while(clan_liste!=0){
            clan_liste = sc.nextInt();
            if(clan_liste!=0){
                lista.add(clan_liste);
            }
        }
        System.out.println(lista);
        System.out.println("Unesite jedan broj");
        int broj2 = sc.nextInt();

        ArrayList<Integer> x = nova(lista, broj2);
        stampanje(x);

    }
    public static ArrayList<Integer> nova(ArrayList<Integer> am, int broj) {
        ArrayList<Integer>x = new ArrayList<>();
        for(int i = 0; i<am.size(); i++){
            if(am.get(i)>broj){
                x.add(am.get(i));
            }
        }
        return x;
    }

    public static void stampanje(ArrayList a){
        for (int i=0; i< a.size(); i++){
            System.out.println("Clan novog niza " + a.get(i));
        }

    }
}
