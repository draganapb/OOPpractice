package za;

import java.util.Scanner;

public class zz {
    public static void main(String[] args) {
        //Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
        // na kraju treba ispisati najveci i najmanji broj od onih koje smo uneli.

        Scanner sc = new Scanner(System.in);
        System.out.println("velicina");
        int velicina = sc.nextInt();
        System.out.println("clanovi");
        int niz[] = new int[velicina];
                for(int i = 0; i<velicina; i++){
                     niz[i] = sc.nextInt();
                }
                int min =niz[0];
                int max = niz[0];
                for(int i = 0; i<velicina; i++){
                    if (niz[i]>max){
                        max = niz[i];
                    }
                    if(niz[i]<min){
                        min = niz[i];
                    }
        }
        System.out.println(max + min);

}
    }
