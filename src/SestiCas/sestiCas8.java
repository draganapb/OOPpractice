package SestiCas;

import java.util.Scanner;

public class sestiCas8 {
    public static void main(String[] args) {



                //Napraviti while petlju koja ce primati clanove dok se ne unese 0

                Scanner sc = new Scanner(System.in);

                //Prvi nacin - 18 bodova
                while (true) {
                    System.out.println("Unesite broj");
                    int x = sc.nextInt();
                    if (x == 0) {
                        break;
                    }
                }

                //----------------

                //Drugi nacin - 20 bodova jer smo izbegli kreiranje beskonacne petlje
                int x = sc.nextInt();
                while (x!=0) {
                    System.out.println("Unesite broj");
                    x = sc.nextInt();
                }


            }
        }









