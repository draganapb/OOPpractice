package za;

import vezbanjeTest.niz2;

import java.util.ArrayList;
import java.util.Scanner;

public class z {
    public static void main(String[] args) {

        //Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj, i u n
        //  ovom nizu smestiti sve brojeve koji su veci od tog unetog broja
        //  (Obratiti paznju da nov niz nema prazna polja tj 0).*/
        int niz[] = {3,5,6,8,100,20};
        Scanner sc = new Scanner (System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();
        int brojac = 0;
        int y = 0;
        for(int i = 0; i<niz.length; i++){
            if((niz[i])>broj){
                brojac = brojac + 1;
            }
        }
        int niz1[] = new int[brojac];
        for(int i = 0; i < niz.length; i++){
            if(niz[i]>broj){
                niz1[y] = niz[i];
                System.out.println(niz1[y]);
                y = y +1;
            }
        }










    }
}
