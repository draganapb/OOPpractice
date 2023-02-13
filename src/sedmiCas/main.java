package sedmiCas;

import vezbanjeTest.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Napraviti proizvoljnu listu imena, zatim uneti ime koje zelite da izbacite iz liste,
        // ispisati poruku u zavisnosti od toga da li je izbaceno ili ne, i da li se uopste nalazi u listi.
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Marko");
        lista.add("Tara");
        lista.add("Nikola");
        lista.add("Stefan");
        lista.add("Marko");
        lista.add("Zorana");
        lista.add("Marko");
        // System.out.println(lista);

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = sc.next();
        int members_before = lista.size();

        for (int i = lista.size() - 1; i >= 0; i--) {
            if (lista.get(i).equals(ime)) {
                lista.remove(i);
                System.out.println("Ime nije vise na listi.");
            }
        }
        int members_after = lista.size();
        if (members_after == members_before) {
            System.out.println("Ime ne postoji u listi");
        }
        System.out.println(lista);


    }
}
