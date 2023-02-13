package Osmicas;

public class Domaci1 {
    public static void main(String[] args) {
        //Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre primati niz
        // imena i String koji zelimo da proverimo, ispisati poruku ukoliko se ime nalazi u nizu,
        // obavestiti ako nije tu. (Ime za proveru vi unosite)


        String[] niz = {"Milica", "Svetlana", "Zoran", "Janko", "Mila"};
        Names(niz, "Svetlana");
    }

    public static void Names(String[] niz, String ime){
        boolean imePostoji = false;
        for(int i = 0; i<niz.length; i++){
            if (ime.equals(niz[i])){
                System.out.println("Ime se nalazi na listi");
                imePostoji = true;
                break;
            }
        }
        if(!imePostoji){
            System.out.println("Ime se ne nalazi na listi");
        }
    }



}

