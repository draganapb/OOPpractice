package Osmicas;

import java.util.ArrayList;
import java.util.Scanner;

public class vezbanje4 {
    public static void main(String[] args) {

        // Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0. Zatim cete uneti
        //  neki broj, pomocu metode napraviti novu listu koja ce u sebi
        //  sadrzati sve brojeve vece od unetog broja. Novu listu pozvati pomocu metode za stampanje elemenata liste

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = 1;
        ArrayList<Integer> lista = new ArrayList<>();
        while(broj!=0){
            broj = sc.nextInt();
            if(broj!=0){
                lista.add(broj);
            }
        }
        System.out.println(lista);

        System.out.println("Unesite broj: ");
        int x = sc.nextInt();


        ArrayList<Integer>novalista = nova(lista,x);
        stampanje(novalista);

    }
    public static ArrayList<Integer>nova(ArrayList<Integer>lista, int x){
        ArrayList<Integer>novalista = new ArrayList<Integer>();
        for(int i = 0; i< lista.size(); i++){
            if(lista.get(i)>x){
                lista.add(lista.get(i));
            }
        }
        return lista;
    }

  public static void stampanje (ArrayList a){
        for(int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }





}
