package SestiCas;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class sestiDOMACI3 {
    public static void main(String[] args) {
        //Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj, i u n
      //  ovom nizu smestiti sve brojeve koji su veci od tog unetog broja
      //  (Obratiti paznju da nov niz nema prazna polja tj 0).*/

        int niz1[] = {2,4,6,8,58,33,78,100};
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int x = sc.nextInt();

        int brojac=0;
        for (int i = 0; i<niz1.length; i++){
            if(niz1[i]>x){
                brojac= brojac +1;
            }
        }
     //   System.out.println(brojac);

        int niz2[] = new int[brojac];
        int y=0;
        for(int i = 0; i<niz1.length; i++){
            if(niz1[i]>x){
                niz2[y]=niz1[i];

        System.out.println(niz2[y]);
        y=y+1;

        }


        }
    }
}
