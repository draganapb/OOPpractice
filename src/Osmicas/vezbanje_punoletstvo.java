package Osmicas;

import java.util.Scanner;

public class vezbanje_punoletstvo{
    public static void main(String[] args) {
        //Korisnik unosi godiste, treba proveriti da li je punoletan
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int godiste = sc.nextInt();
        if(punoletstvo(godine(godiste))){
            System.out.println("Korisnik je punoletan");
        }
        else{
            System.out.println("Nije punoletan");
        }

    }
    public static int godine(int x){
        return 2022-x;
    }
    public static boolean punoletstvo(int x){
        if(x>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
