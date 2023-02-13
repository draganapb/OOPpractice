package vezbanjeTest;

import java.util.Scanner;

public class niz6 {
    public static void main(String[] args) {
        //Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.

       /*

        int niz[] = {2,5,8,74,45,11};


        for(int i = 0; i<niz.length; i++){
            if(niz[i]%2!=0){
                niz[i]= niz[i] + 2;
                System.out.println(niz[i]);

            }

        }

*/



        //Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj, i u n
        //  ovom nizu smestiti sve brojeve koji su veci od tog unetog broja
        //  (Obratiti paznju da nov niz nema prazna polja tj 0).*/



        int niz[] = { 2,3,8,78,569,696};
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int x = sc.nextInt();
        int brojac = 0;

        for(int i = 0; i<niz.length; i++){
            if(niz[i]>x){
                brojac = brojac + 1;
            }
        }
        System.out.println(brojac);
        int nizNovi[]= new int [brojac];

        int y = 0;
        for(int i = 0; i< niz.length; i++){
            if(niz[i]>x){
                nizNovi[y]=niz[i];
                System.out.println(nizNovi[y]);
                y=y+1;

            }

        }












    }
}
