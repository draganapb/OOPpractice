package vezbanjeTest;

public class niz5 {
    public static void main(String[] args) {
//Kreirati dva niza
//Proveriti koji niz ima vise clanova
//Proveriti koji niz ima vecu sumu clanova
//Proveriti koji niz ima vise parnih clanova i koliko
//Proveriti koji niz ima vise brojeva deljivih sa 5 i koliko
//DODATI KAD OBA NIZA IMAJU ISTIB BROJ CLANOVA

        int niz1 []= {5,8,14,25,155};
        int niz2 []= {50,5,15};
        if(niz1.length>niz2.length){
            System.out.println("Prvi niz ima vise clanova");
        }
        else if(niz1.length< niz2.length){
            System.out.println("Drugi niz ima vise clanova");
        }
        else{
            System.out.println("Oba niza imaju jednak broj clanova");
        }

        int suma1=0;
        for(int i = 0; i< niz1.length; i++){
            suma1 = suma1 + niz1[i];

        }
        System.out.println("Suma prvog niza je " + suma1);

        int suma2=0;
        for(int i =0; i<niz2.length; i++){
            suma2 = suma2 + niz2[i];
        }
        System.out.println(suma2 + "je suma drugog niza");

        if(suma1>suma2){
            System.out.println("Suma prvog niza je veca");
        }
        else if(suma1<suma2){
            System.out.println("Suma drugog niza je veca");
        }
        else{
            System.out.println("Sume oba niza su jednake");
        }

        int brojac = 0;
        for(int i =0; i< niz1.length; i++){
            if(niz1[i]%2==0){
                brojac = brojac + 1;

            }

        }

        System.out.println(brojac);

        int brojac2 = 0;
        for(int i = 0; i<niz2.length; i++){
            if(niz2[i]%2==0){
                brojac2 = brojac2 + 1;
                System.out.println("Parni su" + niz2[i]);

            }

        }

        System.out.println(brojac2);
        int brojac3 = 0;
       for(int i = 0; i< niz1.length; i++){
           if(niz1[i]%5==0){
               brojac3 = brojac3 + 1;
               System.out.println(niz1[i] + "deljivi sa 5");
           }
       }
        System.out.println(brojac3);





    }
}
