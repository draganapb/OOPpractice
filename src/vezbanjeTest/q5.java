package vezbanjeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        //Zadatak 43 Preko skenera uneti 4 broja u listu.
// Ako je barem jedan broj negativan uraditi sumu svih brojeva,
// u suprotnom pomnoziti sve brojeve.
//Na kraju zadatka zakomentarisati testirane kombinacije

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        boolean negativni =  false;

        //System.out.println(lista);
        int proizvod = 1;
        int suma = 0;

        for(int i = 0; i<4; i++) {
            System.out.println("Unesite brojeve");
            lista.add(sc.nextInt());

            if (lista.get(i) < 0) {
                negativni = true;
            }
        }

        for(int i = 0; i<4; i++){
            if (negativni){
                suma = suma + lista.get(i);
            }
            else{
                proizvod = proizvod * lista.get(i);
            }

        }
        if(negativni) {
            System.out.println(suma);
        }
        else{
            System.out.println(proizvod);
        }

    }
}
