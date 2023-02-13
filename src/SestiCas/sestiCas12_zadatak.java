package SestiCas;

public class sestiCas12_zadatak {
    public static void main(String[] args) {

        //Zadatak 33
//Kreirati dva niza
//Proveriti koji niz ima vise clanova
//Proveriti koji niz ima vecu sumu clanova
//Proveriti koji niz ima vise parnih clanova i koliko
//Proveriti koji niz ima vise brojeva deljivih sa 5 i koliko
//DODATI KAD OBA NIZA IMAJU ISTIB BROJ CLANOVA
        int niz1[] = {9, 11, 13, 25, 896};
        int niz2[] = {3, 6, 8, 1000, 700, 2, 4};

        if (niz1.length < niz2.length) {
            System.out.println("Vise clanova ima niz2");
        } else {
            System.out.println("Vise clanova ima niz1");
        }

            int suma1 = 0;
            for (int i = 0; i < niz1.length; i++) {
                suma1 = suma1 + niz1[i];

            }
            System.out.println(suma1);

            int suma2 = 0;
            for (int i = 0; i < niz2.length; i++) {
                suma2 = suma2 + niz2[i];

            }
            System.out.println(suma2);

            if (suma1 > suma2) {
                System.out.println("Suma jedan je veca");
            } else {
                System.out.println("Suma dva je veca");
            }

            int brojac1 = 0;
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] % 2 == 0) {
                    brojac1 = brojac1 + 1;

                }
            }
        System.out.println(brojac1);

            
            int brojac2 = 0;
            for (int i = 0; i < niz2.length; i++) {
                if (niz2[i] % 2 == 0) {
                    brojac2 = brojac2 + 1;
                }
            }
            System.out.println(brojac2);

            if (brojac1 > brojac2) {
                System.out.println("Prvi niz ima vise parnih brojeva, ukupno ih je " + brojac1);
            } else {
                System.out.println("Drugi niz ima vise parnih brojeva, ukupno ih je " + brojac2);

            }
            int x=0;
            for(int i = 0; i<niz1.length; i++){
                if(niz1[i]%5==0){
                    x=x+1;

                }
            }
        System.out.println(x);

        int y=0;
        for(int i = 0; i<niz2.length; i++){
            if(niz2[i]%5==0){
                y=y+1;

            }
        }
        System.out.println(y);

         if(x>y){

             System.out.println("Prvi niz ima vise  brojeva deljivih sa 5, ukupno ih je " + x );
         }
        else{
             System.out.println("Drugi niz ima vise  brojeva deljivih sa 5 i ukupno ih je " + y);
        }



    }
}
