package vezbe;

import java.util.Scanner;

public class vezba4 {
    public static void main(String[] args) {
        //Zadatak 13
//Preko skenera unosite tri broja
//Prvi broj komanduje koja akcija ce se raditi u switchu (1 - sabiranje, 2 - oduzimanje, 3 - mnozenje)
//Zavisno koja komanda se izabere ta akcija treba da se izvrsi nad druga dva unosa
//Napomena: Ako se radi oduzimanje treba oduzeti veci broj od manjeg


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        int x = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int y = sc.nextInt();
        System.out.println("Unesite treci broj: ");
        int z = sc.nextInt();

        switch(x){

            case 1:
                int rezultat = y + z;
                System.out.println("Rezultat je " + rezultat);
            break;

            case 2:
                 rezultat = y-z;
                 if(y>z && y==z){
                     System.out.println("Rezultat je " + rezultat);
                 }
                else if(z>y)

                {
                    System.out.println("Rezultat je " + (z-y));
                 }







        }




    }
}
