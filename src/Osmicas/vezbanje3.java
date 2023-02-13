package Osmicas;

public class vezbanje3 {
    public static void main(String[] args) {
        //Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre primati niz
        // imena i String koji zelimo da proverimo, ispisati poruku ukoliko se ime nalazi u nizu,
        // obavestiti ako nije tu. (Ime za proveru vi unosite)

        String niz[] = {"Mira", "Sanja", "Milos", "Tara"};
        provera(niz, "Mira");





    }
    public static void provera(String [] niz, String naziv){
        boolean imePostoji = false;
        for(int i = 0; i< niz.length; i++) {
            if (naziv.equalsIgnoreCase(niz[i])) {
                System.out.println("Ime se nalazi u listi");
               // imePostoji = true;
                break;
            }
            if(!imePostoji){
                System.out.println("Nema ga u listi");
                break;
            }
        }

    }
}
