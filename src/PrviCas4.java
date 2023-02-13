import java.util.Scanner;

public class PrviCas4 {
    public static void main(String[] args) {

        Scanner nazivSkenera = new Scanner(System.in);

        System.out.println("Unesite prvi broj");
        int x = nazivSkenera.nextInt();
        System.out.println("Uneli ste broj " + x);

        System.out.println("Unesite drugi broj");
        int y = nazivSkenera.nextInt();
        System.out.println("Uneli ste broj " + y);

        System.out.println("Zbir dva uneta broja je " + (x + y));

        //--------------

        System.out.println("Unesite double vrednost");
        double broj = nazivSkenera.nextDouble();

        System.out.println("Uneli ste vrednost " + broj);

        //---------------

        /*System.out.println("Unesite neku recenicu");
        String recenica = nazivSkenera.nextLine();

        System.out.println("Uneli ste recenicu " + recenica);*/

        //-----------------

        System.out.println("Unesite string vrednost");
        String rec = nazivSkenera.next();

        System.out.println("Uneli ste vrednost " + rec);




    }
}