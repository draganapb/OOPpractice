package sedmiCas;

import java.util.ArrayList;

public class Domaci1 {
    public static void main(String[] args) {
        // Napraviti proizvoljan niz brojeva, podeliti ih u dve liste,
        // jedna lista ce u sebi sadrzati sve parne brojeve dok ce druga lista zadrzati sve neparne brojeve.
        int niz[] = {3, 6, 9, 13, 46, 88, 97, 137, 200};
        ArrayList lista1 = new ArrayList<>();
        ArrayList lista2 = new ArrayList<>();
        int brojac = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
             //   System.out.println(niz[i]);
                lista1.add(niz[i]);

            }
        }
        System.out.println("Parni brojevi: " + lista1);

        for (int i = 0; i<niz.length; i++){
            if (niz[i]%2!=0){
                lista2.add(niz[i]);

            }
        }

        System.out.println("Neparni brojevi: " +lista2);

    }
}
