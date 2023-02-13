package Osmicas;

import java.util.Scanner;

public class vezbanje2 {
    public static void main(String[] args) {
        //Kreirati metodu "bazaPodataka" koja ce u sebi da sadrzi niz imena top 5 tenisera i top 5 teniserki
//Kreirati posebnu metodu koja ce vrsiti proveru da li unos iz main metode preko skenera sadrzi tenisera/ku u svojoj bazi

Scanner sc = new Scanner(System.in);
String naziv = sc.next();


        System.out.println(Provera(bazaPodataka(), naziv));

    }

    public static String [] bazaPodataka(){
        String [] niz = {"Novak", "Jelene", "Ana", "Agasi"};
        return niz;
    }
    public static boolean Provera(String [] niz, String naziv){
        boolean imePostoji = false;

        for(int i = 0; i< niz.length; i++){
            if(naziv.equalsIgnoreCase(niz[i])){
               imePostoji =  true;
                System.out.println("Postoji");
            }
            if(!imePostoji){
                System.out.println("Ime ne postoji u listu");
            }
        }
        return imePostoji;
    }
}

