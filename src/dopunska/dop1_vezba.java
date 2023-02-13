package dopunska;

import java.util.Scanner;

public class dop1_vezba {
    public static void main(String[] args) {
        //Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj, i u n
        //  ovom nizu smestiti sve brojeve koji su veci od tog unetog broja
        //  (Obratiti paznju da nov niz nema prazna polja tj 0).*/
        int niz1 [] = {2,5,8,69,100};
        Scanner sc = new Scanner(System.in);
        System.out.println("broj");
        int broj = sc.nextInt();
                int brojac = 0;
        for(int i = 0; i < niz1.length; i++){
            if(niz1[i]>broj){
                brojac = brojac + 1;
            }
        }
        int niz2 [] = new int[brojac];
        int y = 0;
        for(int i = 0; i< niz1.length; i++){
            if(niz1[i]>broj){
                niz2[y] = niz1[i];
                System.out.println(niz2[y]);
//y=y+1;
            }
}
    }
}
