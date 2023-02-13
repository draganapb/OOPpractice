package dopunska;

public class dop3 {
    public static void main(String [] arg) {

        int[] niz1 = {2, 4, 6, 1, 8};
        int [] niz2 = {3, 1, 1};

        int veci;
        int manji;

        if(niz1.length>niz2.length) {
            veci = niz1.length;
            manji = niz2.length;
        } else {
            veci = niz2.length;
            manji = niz1.length;
        }

        int[] niz;

        if(niz1.length > niz2.length) {
            niz = niz1;
        } else {
            niz = niz2;
        }

        int [] nov = new int[veci];

        for(int i = 0; i<veci; i++) {
            if(i < manji) {
                nov[i] = niz1[i] + niz2[i];
            } else {
                nov[i] = niz[i];
            }
            System.out.println(nov[i]);
        }
    }
}