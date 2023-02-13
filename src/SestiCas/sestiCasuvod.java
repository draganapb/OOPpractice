package SestiCas;

public class sestiCasuvod {

    public static void main(String[] args) {

        int niz1[];
        int[] niz2; //Deklarisanje niza

        niz1 = new int[4];
        //Pri kreiranju niza prosledjujemo informaciju koliko ce clanova imati
        //5 8 1 13 - clanovi
        //Broj 5 ima index 0
        //Broj 8 ima index 1
        //Broj 1 ima index 2
        //Broj 13 ima index 3

        niz1[0] = 5;
        niz1[1] = 8;
        niz1[2] = 1;
        niz1[3] = 13;

        System.out.println("Velicina niza je " + niz1.length);

        /*System.out.println(niz1[0]);
        System.out.println(niz1[1]);
        System.out.println(niz1[2]);
        System.out.println(niz1[3]);*/

        for (int i = 0; i < niz1.length; i++) {
            System.out.println(niz1[i]);
        }




    }
}