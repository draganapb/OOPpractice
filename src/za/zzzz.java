package za;

import java.util.Scanner;

public class zzzz {
    public static void main(String[] args) {
        //Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din,
// kruske 100 din i banane 140 din, tako da se suma
//racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo),
// toliko dodajemo na sumu, kada se unese ".",
//program izlazi iz petlje i pise ukupnu cenu navedenog voca.


        // Napraviti program gde unosite 5 brojeva i uz poruku ispisati koji je bio najveci od svih njih. (edited)

        Scanner sc = new Scanner(System.in);
        int niz[] = new int [5];
        System.out.println("Unesite brojeve");
        int min = niz[0];
        int max = niz[0];
        for(int i = 0; i < niz.length; i++){
            niz[i]= sc.nextInt();
        }
        for(int i = 0; i<niz.length; i++){
            if(niz[i]>max){
                max = niz[i];
            }
            if(niz[i]<min){
                min = niz[i];
            }
        }


        System.out.println(min);




    }
}
