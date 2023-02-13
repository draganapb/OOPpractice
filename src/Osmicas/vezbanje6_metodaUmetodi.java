package Osmicas;

public class vezbanje6_metodaUmetodi{

    public static void main(String[] args) {
        //Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre primati niz
        // imena i String koji zelimo da proverimo, ispisati poruku ukoliko se ime nalazi u nizu,
        // obavestiti ako nije tu. (Ime za proveru vi unosite)

        String niz1[] = {"Marko", "Sanja", "Toma"};
        String niz2[] = {"Lepa", "Katarina", "Bogdan"};
//        boolean imePostoji = provera(niz1, "Toma");
        stampa(niz2, "Bogda");
    }

    public static boolean provera(String[] niz, String naziv) {
        boolean imePostoji = false;
        for (int i = 0; i < niz.length; i++) {
            if (naziv.equalsIgnoreCase(niz[i])) {
                imePostoji = true;
            }
        }
        return imePostoji;
    }
    public static void stampa(String niz[], String naziv){
        if (provera(niz, naziv)) {
            System.out.println("ime postoji");
        } else {
            System.out.println("ne postoji");
        }
    }
}
