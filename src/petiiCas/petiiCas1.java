package petiiCas;

public class petiiCas1 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
        }
        //FOR petlja se koristi kada unapred znamo koliko puta treba petlja da se izvrsi

        //-----------

        int
                i = 0;
        while (i<3) {
            System.out.println("World");
            i++;
        }
        //WHILE petlja se koristi kada unapred ne znamo koliko puta treba petlja da se izvrsi

        //-----------

        int j = 0;
        do {
            System.out.println("!!!");
            j++;
        } while (j<3);
        //DO WHILE petlja se koristi kada petlja treba BAREM jednom da se izvrsi

    }
}