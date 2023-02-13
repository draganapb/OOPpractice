package Osmicas;

import java.util.ArrayList;
import java.util.Scanner;

public class vezbanje5 {
    public static void main(String[] args) {
        // Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0. Zatim cete uneti
        //  neki broj, pomocu metode napraviti novu listu koja ce u sebi
        //  sadrzati sve brojeve vece od unetog broja. Novu listu pozvati pomocu metode za stampanje elemenata liste

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("unesi broj");
        int x =1;
        while(x!=0){
            x = sc.nextInt();
            if(x!=0){
                lista.add(x);
            }
        }
        System.out.println(lista);
        System.out.println("unesi broj");
        int broj = sc.nextInt();

        ArrayList<Integer> lista1 = nova(lista, broj);
        stampa(lista1);

    }
    public static ArrayList<Integer>nova(ArrayList<Integer> a, int broj){
        ArrayList<Integer>x = new ArrayList<>();
        for(int i = 0; i<a.size(); i++){
            if(a.get(i)>broj){
                x.add(a.get(i));
            }
        }
        return x;
    }

    public static void stampa(ArrayList a){
        for(int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}

