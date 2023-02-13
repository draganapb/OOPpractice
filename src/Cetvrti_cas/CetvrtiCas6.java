package Cetvrti_cas;

public class CetvrtiCas6 {
    public static void main(String[] args) {
        //Zadatak 18
//Prikazati proizvod neparnih brojeva od 10 do 15 -bez broja 15
//Prikazati sumu parnih brojeva od 1 do 10

        //  for (int i = 0; i < 5; i++) {

        int proizvod = 1;

        for(int i = 10; i<15; i++){
            if(i%2!=0){
                proizvod=proizvod*i;
            }
        }
        System.out.println("Proizvod  brojeva je " + proizvod);

        int suma = 0;
        for(int i = 1; i<=10; i++){
            if(i%2==0){
                suma = suma + i;
            }
        }
        System.out.println("Zbir brojeva je " + suma);

        //
        //public class Zadatak18 {
        //    public static void main(String[] args) {
        //
        //        //Zadatak 18
        //        //Prikazati proizvod neparnih brojeva od 10 do 15 -bez broja 15
        //        //Prikazati sumu parnih brojeva od 1 do 10
        //
        //        /*int proizvod = 1;
        //        for (int i = 10; i < 15; i++) {
        //            if (i%2!=0) {
        //                proizvod = proizvod * i;
        //            }
        //        }
        //
        //        System.out.println("Proizvod je " + proizvod);
        //
        //        int suma = 0;
        //        for (int i = 1; i <= 10; i++) {
        //            if (i%2==0) {
        //                suma = suma + i;
        //            }
        //        }
        //
        //        System.out.println("Suma je " + suma);*/

        //        //package Zadaci; AKO SMO HTELI DA OBJEDINIMO OVA DVA FORa:
        //        int suma = 0;
        //        int proizvod = 1;
        //        for (int i = 1; i < 15; i++) {
        //            if (i>=10) {
        //                if (i%2!=0) {
        //                    proizvod = proizvod * i;
        //                }
        //            }
        //
        //            if (i<=10) {
        //                if (i%2==0) {
        //                    suma = suma + i;
        //                }
        //            }
        //        }
        //
        //        System.out.println("Proizvod je " + proizvod);
        //        System.out.println("Suma je " + suma);
        //
        //    }
        //}











    }
}
