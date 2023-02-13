package petiiCas;

import java.util.Scanner;

public class vezba4whileTRUE {
    public static void main(String[] args) {
        //Koristeci WHILE petlju napraviti program gde korisnik unosi dvocifrene brojeve
//sve dok ne unese 'nedvocifren' broj
//na kraju programa ispisati prvu i drugucifru dvocifrenog broja
////napomena: ako je dvocifren broj deljiv sa 5 onda prekinuti program

     /*   Scanner sc = new Scanner(System.in);
        int broj = 0;
        while(true){

            System.out.println("Unesite broj: ");
            broj = sc.nextInt();

            if(broj<10 || broj >99 || broj%5==0){
                break;
            }
            System.out.println("prva cifra je " + (broj / 10));
            System.out.println("druga cifra je" + (broj % 10));
        }
*/
        //Koristeci WHILE petlju napraviti program gde korisnik unosi dvocifrene brojeve
//sve dok ne unese 'nedvocifren' broj
//na kraju programa ispisati prvu i drugucifru dvocifrenog broja
////napomena: ako je dvocifren broj deljiv sa 5 onda prekinuti program

    /*    Scanner sc = new Scanner (System.in);
        int broj = 0;
        while(true){
            System.out.println("Uneti broj:");
            broj = sc.nextInt();

            if(broj<10 || broj>100 || broj%5==0){
                break;
            }
        }

*/


      /*  Scanner sc = new Scanner(System.in);


        for( int i = 10; i<100; i++){
            System.out.println("Unesite broj");
            int broj = sc.nextInt();
            if(broj<10 || broj>99 || broj%5==0){
                break;
            }
            System.out.println("ss");
        }
*/
        Scanner sc = new Scanner(System.in);
        int broj;

        do{
            System.out.println("Unesite broj");
             broj = sc.nextInt();

        }
        while((broj>9 && broj<=99 && broj%5!=0));
    }
}
