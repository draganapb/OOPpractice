package vezbanjeTest;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
      /*  //Koristeci DO WHILE petlju napisati program gde korisnik unosi svoj PIN
//Korisnik moze neogranicno puta da unosi PIN
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do{
            System.out.println("Unesite pin");
            int pin = sc.nextInt();
        }

        while(i>0);


*/

        //Koristeci WHILE petlju napraviti program gde korisnik unosi dvocifrene brojeve
//sve dok ne unese 'nedvocifren' broj
//na kraju programa ispisati prvu i drugucifru dvocifrenog broja
////napomena: ako je dvocifren broj deljiv sa 5 onda prekinuti program


        Scanner sc = new Scanner(System.in);
        int i =10;
//        int broj=0;
        while(i>9 && i<100){
            System.out.println("Uneti dvocifren broj");
             i = sc.nextInt();
                 if (i%5==0){
                     break;
                 }
             }

            System.out.println(i);

        }
     //   System.out.println("Prva cifra broja " + broj+ "je" +(broj/10));
     //   System.out.println("Druga cifra broja  "+ broj+ " je " +(broj%10));



        //Koristeci WHILE petlju napraviti program gde korisnik unosi dvocifrene brojeve
//sve dok ne unese 'nedvocifren' broj
//na kraju programa ispisati prvu i drugucifru dvocifrenog broja
////napomena: ako je dvocifren broj deljiv sa 5 onda prekinuti program

    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Unesi dvocifren broj: ");
        int x = sc.nextInt();
        int i = x;
        while(x<100&&x>9){
            System.out.println("Unesi dvocifren broj: ");
             x = sc.nextInt();
             if(x%5==0){
                 break;
             }
        }
*/








    }


