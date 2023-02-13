package vezbe;

import java.util.Scanner;

public class vezbe14 {
    public static void main(String[] args) {
       // /2. Napraviti program gde unosite svoju godinu rodjenja i ispisati broj prestupnih godina
        // od vaseg rodjenja do tekuce godine.


        Scanner sc = new Scanner(System.in);
        System.out.println("Rodjenje: ");
        int rodjenje = sc.nextInt();
        int broj = 2022-rodjenje;
        int brojac = 0;
        for(int i = rodjenje; i<2022; i++){
            if(i%4==0){
                if(i%100!=0 || i%400!=0){
                    brojac = brojac+1;
                }
            }
        }

        System.out.println(brojac);















    }

}
