package dopunska;

import java.util.Scanner;

public class dop1 {
    public static void main(String[] arg ) {


        int[] niz = {4, 2, 1, 5, 9, 11};

        for(int i = 0; i<niz.length; i++) {
            if(niz[i]%2==0) {
                niz[i] += 2;
            }
            System.out.println(niz[i]);
        }

        int knjige = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi tacku: ");
        String s = sc.next();

        while(s.equals(".") && knjige>0) {
            s = sc.next();
            System.out.println("Prodata knjiga!");
            knjige--;
        }
        if(knjige == 0) {
            System.out.println("Prodale se sve knjige");
        } else {
            System.out.println("Izasli ste iz petlje!");
        }

    }
}