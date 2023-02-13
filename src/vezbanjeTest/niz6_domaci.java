package vezbanjeTest;

import java.util.Scanner;

public class niz6_domaci {
    public static void main(String[] args) {
        //Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
        // na kraju treba ispisati najveci broj od onih koje smo uneli.

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti velicinu niza: ");
        int velicina = sc.nextInt();
        int niz[] = new int[velicina];

        System.out.println("Unesite clanove niza: ");

        for (int i = 0; i < velicina; i++) {
            niz[i] = sc.nextInt();

        }
        int maks = 0;
        for(int i = 0; i< velicina; i ++){
            if (i==0){
                maks = niz[i];
            }
            if(niz[i]>maks){
                maks = niz[i];
            }
        }
        System.out.println(maks);
    }
}
