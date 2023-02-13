package SestiCas;

public class SestiCas2 {

        public static void main(String[] args) {

            //Zadatak 29
//Kreirati niz od 100 clanova
//Koji ce sadrzati brojeve od 1 do 100
//Odstampati citav niz

            int niz[] = new int[100];

        /*niz[0] = 0;
        niz[1] = 1;
        niz[2] = 2;*/

            for (int i = 0; i < niz.length; i++) {
                niz[i] = i+1;
                System.out.println(niz[i]);
            }


        }
    }

