package SestiCas;

public class sestiCas10 {
    public static void main(String[] args) {


                int niz1[] = new int[3];
                niz1[0] = 1;
                niz1[1] = 4;
                niz1[2] = 5;

                //----------------

                int niz2[] = {1,4,2,55,789,123455};

                //----------------

                System.out.println("Velicina prvog niza je " + niz1.length);
                System.out.println("Velicina drugog niza je " + niz2.length);

                for (int i = 0; i < niz1.length; i++) {
                    System.out.println((i+1) + ". clan prvog niza je " + niz1[i]);
                }

                System.out.println("-----------");

                for (int i = 0; i < niz2.length; i++) {
                    System.out.println((i+1) + ". clan drugog niza je " + niz2[i]);
                }

                System.out.println("-----------");

                if (niz1.length > niz2.length) {
                    System.out.println("Prvi niz ima vise clanova");
                } else if (niz1.length < niz2.length) {
                    System.out.println("Drugi niz ima vise clanova");
                } else {
                    System.out.println("Nizovi imaju isti broj clanova");
                }


            }
        }

