package Osmicas;

public class cas8_13 {
    public static void main(String[] args) {

                //Sabiram prvi clan prvog niza sa prvim clanom drugog niza
                System.out.println(niz1(0)+niz2(1));
            }

            public static int niz1(int x) {
                int niz[] = {1,2,3,5,7,6,22,446,88};
                return niz[x];
            }

            public static int niz2(int x) {
                int niz[] = {1,7,6,22,125,878};
                return niz[x];
            }
        }
