package SestiCas;

public class sestiCas_6 {
    public static void main(String[] args) {
        //Sabiranje dva niza

                int velicinaNizova = 4;
                int niz1[] = new int[velicinaNizova];
                int niz2[] = new int[velicinaNizova];

                niz1[0] = 2;
                niz1[1] = 15;
                niz1[2] = 11;
                niz1[3] = 300;

                niz2[0] = 0;
                niz2[1] = 11;
                niz2[2] = 1;
                niz2[3] = 44;

                int niz3[] = new int[velicinaNizova];

        /*niz3[0] = niz1[0] + niz2[0];
        niz3[1] = niz1[1] + niz2[1];
        niz3[2] = niz1[2] + niz2[2];
        niz3[3] = niz1[3] + niz2[3];*/

                for (int i = 0; i < velicinaNizova; i++) {
                    niz3[i] = niz1[i] + niz2[i];
                }

                for (int i = 0; i < velicinaNizova; i++) {
                    System.out.println(niz3[i]);
                }


            }
        }

