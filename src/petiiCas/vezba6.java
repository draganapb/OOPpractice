package petiiCas;

import java.util.Scanner;

public class vezba6 {
    public static void main(String[] args) {

        //Napraviti program gde korisnik unosi brojeve sve dok ne unese 0
//Na kraju ispisati koji je najveci, a koji najmanji broj od prethodno unetih


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj= sc.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        while(true){
            System.out.println("Unesi broj");
            if(broj>max){
                max=broj;
                if(broj<min){
                    min = broj;
                }
            }
            broj = sc.nextInt();

            if(broj==0){
                break;
            }
        }
        System.out.println("Najmanji je " + min);
        System.out.println("Najveci je" + max);














    }
}
