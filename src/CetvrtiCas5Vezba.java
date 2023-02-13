import java.util.Scanner;

public class CetvrtiCas5Vezba {
    public static void main(String[] args) {

        //Korisnik najvise 5 puta moze da pogodi "bingo" broj
        //Ako unese 0 prikaze se poruka "Bingo!" i izlazi iz petlje
        //  for (int i = 0; i < 5; i++) {

      /*  Scanner sc = new Scanner(System.in);
        int broj;

        for(int i = 0; i<5; i++){
            System.out.println("Unesite neki broj");
             broj = sc.nextInt();
             if( broj == 0){
                 System.out.println("Bingo");
                 break;
             }
        }
*/
        /*Scanner sc = new Scanner(System.in);
        int broj;
        for(int i = 0; i<5; i++){
            System.out.println("Unesite broj");
             broj = sc.nextInt();
              if(broj==0){
                  System.out.println("bingo");
              break;
              }





        }
*/

/* Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj");
        int broj = sc.nextInt();

        for(int i = 0; i<broj; i++){
            System.out.println(i);
        }
*/
        //Prikazati proizvod neparnih brojeva od 10 do 15 -bez broja 15
//Prikazati sumu parnih brojeva od 1 do 10

     /*  int  proizvod = 1;
       int suma = 0;

       for(int i = 10; i <15; i++) {
           if (i % 2 != 0) {
               proizvod = proizvod * i;

           }
       }
        System.out.println(proizvod);

       for( int i = 1; i <11; i++){
           if(i%2==0){
               suma = suma + i;
           }

       }
        System.out.println(suma);
*/

        //Prikazati sumu brojeva do broja N koji unosite preko skenera


      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int N = sc.nextInt();
        int suma = 0;
        for(int i = 0; i< N; i++){
            suma = suma + i;

        }
        System.out.println(suma);*/

        //Zadatak 20
        //Kreirati program za login gde korisnik moze najvise 3 puta da unese username i password
        //Ako tri puta pogresi unos ispisati "Neuspesan login. Pokusajte ponovo."

      /*  Scanner sc = new Scanner (System.in);
        String username;
        int password;
         for(int i = 1; i<4; i++){
             System.out.println("Unesite pasword i username");
             username = sc.next();
             password = sc.nextInt();
             if(username.equals("dragana")&& password == 123){
                 System.out.println("Uspesan login");
                 break;
             }
             else if(i==3) {
                 System.out.println("pogresan unos");
             }
         }


*/
        //     //1. Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj");
        int x = sc.nextInt();
        int faktorijel = 1;
        for ( int i = 0; i<=x; i++){
            faktorijel = faktorijel*i;
        }
        System.out.println(faktorijel);


    }
}
