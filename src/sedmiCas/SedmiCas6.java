package sedmiCas;

import java.util.ArrayList;

public class SedmiCas6 {
    public static void main(String[] args) {

                ArrayList<String> rezervacijaZaRodjendan = new ArrayList<>();

                System.out.println("Velicina liste je " + rezervacijaZaRodjendan.size());

                rezervacijaZaRodjendan.add(null);
                rezervacijaZaRodjendan.add(null);
                rezervacijaZaRodjendan.add(null);
                rezervacijaZaRodjendan.add(null);
                rezervacijaZaRodjendan.add(null);

                System.out.println("Velicina liste je " + rezervacijaZaRodjendan.size());
                System.out.println(rezervacijaZaRodjendan);

                rezervacijaZaRodjendan.set(0, "Marko");
                rezervacijaZaRodjendan.set(1, "Aleksandra");
                rezervacijaZaRodjendan.set(2, "Tamara");
                rezervacijaZaRodjendan.set(3, "Aleksandar");
                rezervacijaZaRodjendan.set(4, "Dragoljub");
                System.out.println(rezervacijaZaRodjendan);

                rezervacijaZaRodjendan.set(0, "Sandra");
                System.out.println(rezervacijaZaRodjendan);






            }
        }











