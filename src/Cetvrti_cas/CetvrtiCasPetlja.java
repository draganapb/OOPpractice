package Cetvrti_cas;

public class CetvrtiCasPetlja {
    public static void main(String[] args) {


                //Ispisati sumu brojeva od 1 do 10 -ukljucujuci i 10
                int suma = 0;

                for (int i = 0; i <= 10; i++) {
                    System.out.println("Petlja je pokrenuta " + (i+1) + ". put");
                    System.out.println("Suma pre dodavanja " + suma);
                    System.out.println("Broj koji se dodaje " + i);
                    suma = suma + i;
                    System.out.println("Suma nakon dodavanja " + suma);
                    System.out.println("=======");
                }

                System.out.println("-------------");
                System.out.println("Konacna suma je " + suma);

            }
        }

//package CetvrtiCas;
//
//public class CetvrtiCas2 {
//    public static void main(String[] args) {
//
//        //Odstampati sve parne dvocifrene brojeve
//
//        for (int i = 10; i < 100; i++) {
//            if (i%2==0) {
//                System.out.println(i);
//            }
//        }
//
//
//
//    }
//}
