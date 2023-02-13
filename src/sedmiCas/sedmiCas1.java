package sedmiCas;

import java.util.ArrayList;

public class sedmiCas1 {
    public static void main(String[] args) {
        //Zadatak 34
//Kreirati opstu listu sa vasim podacima (ime, godine, visina u metrima i boolean da li ucite javu
//Listu odstampati celu pa zatim svaki clan pojedinacno

        ArrayList profil = new ArrayList<>();
        profil.add(" Dragana");
        profil.add(32);
        profil.add(170);
        profil.add(true);


        for(int i = 0; i<profil.size(); i++){
            System.out.println(profil.get(i));
        }
        System.out.println(profil);


    }
}
