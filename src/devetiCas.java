import vezbanjeTest.niz2;

public class devetiCas {
    public static void main(String[] args) {
//Zadatak 49 - U main metodi kreirati vise nizova brojeva
//Napraviti posebnu metodu koja ce da broji koliko niz ima parnih clanova
//Napraviti posebnu metodu koja ce da broji koliko niz ima neparnih clanova


        int niz1[] = {1,3,4,8,10,11,45};
        int niz2[] = {12,25,23,65,88,95,100};
        int niz3[] = {27,33,64,86,75,102};

        System.out.println(niz(niz2));

    }
     public static int niz(int [] niz) {
         int brojac = 0;
         for (int i = 0; i < niz.length; i++) {
             if (niz[i] % 2 == 0){


             brojac = brojac + 1;
             }
         }

         return brojac;
     }

  /*  public static int niz2(int [] niz){
        int brojac = 0;
        for(int i = 0; i<niz2.length; i++){
            if (niz2[i]%2!=0);
            brojac = brojac + 1;
        }
        return brojac;*/

       }


