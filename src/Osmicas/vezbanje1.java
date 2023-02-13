package Osmicas;

import java.util.ArrayList;
import java.util.Scanner;

public class vezbanje1 {
    public static void main(String[] args) {
        //Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0. Zatim cete uneti
        //  neki broj, pomocu metode napraviti novu listu koja ce u sebi
        //  sadrzati sve brojeve vece od unetog broja. Novu listu pozvati pomocu metode za stampanje elemenata liste

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>lista = new ArrayList<>();
        int broj = 1;

        while(broj!=0){
            broj = sc.nextInt();
            lista.add(broj);
        }
        System.out.println(lista);

        System.out.println("Unesite neki broj");
        int x = sc.nextInt();

       ArrayList<Integer> lista2 = novaLista(lista, x);
        System.out.println(lista2);
    }


    public static ArrayList<Integer> novaLista(ArrayList<Integer> nova, int x){
        ArrayList<Integer>Lista2 = new ArrayList<>();
        for(int i = 0; i< nova.size(); i++){
            if(nova.get(i) >x){
                Lista2.add(nova.get(i));

            }

        }
        return Lista2;

    }
public static void stampanje(ArrayList nova)
{
    for(int i = 0; i< nova.size(); i++){
        System.out.println("Clanovi nove liste su: "  + nova.get(i));
    }
}
    }










