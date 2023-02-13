package SestiCas;

public class sestiCas_3 {


    public static void main(String[] args) {

        //Kreirati dva niza po 5 clanova
        //Drugi niz treba da ima duplo vece clanove od prvog niza

        int niz1[];
        int niz2[];

        niz1 = new int[5];
        niz2 = new int[5];

        niz1[0] = 2;
        niz1[1] = 3;
        niz1[2] = 5;
        niz1[3] = 1;
        niz1[4] = 7;

        /*niz2[0] = 4;
        niz2[1] = 6;
        niz2[2] = 10;
        niz2[3] = 2;
        niz2[4] = 14;*/

        /*niz2[0] = niz1[0] * 2;
        niz2[1] = niz1[1] * 2;
        niz2[2] = niz1[2] * 2;
        niz2[3] = niz1[3] * 2;
        niz2[4] = niz1[4] * 2;*/

        //Prva petlja je samo dodeljivanje vrednosti drugom nizu
        for (int i = 0; i < niz2.length; i++) {
            niz2[i] = niz1[i] * 2;
        }

        //Druga petlja nam je samo stampanje svakog clana drugog niza
        for (int i = 0; i < niz2.length; i++) {
            System.out.println(niz2[i]);
        }




    }
}