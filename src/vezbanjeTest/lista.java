package vezbanjeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class lista {
    public static void main(String[] args) {
   //
        //Kreirati opstu listu sa vasim podacima (ime, godine, visina u metrima i boolean da li ucite javu
//Listu odstampati celu pa zatim svaki clan pojedinacno

     /*   ArrayList profil = new ArrayList<>();

        profil.add("Ime");
        profil.add("Prezime: ");
        profil.add(1.78);
        profil.add(true);

        for(int i = 0; i<profil.size(); i++){
            if(profil.get(i).equals(true))
            {
                System.out.println("Da li ucite Javu");
            }
        }


*/
        //Kreirati string listu sa imenima ljudi koji ce vam doci na rodjendan
//Listu odstampati celu pa zatim svaki clan pojedinacno


      /*
        ArrayList<String>rodjendan = new ArrayList<>();
     */
     /*
        rodjendan.add("Milica");
        rodjendan.add("Marko");
        rodjendan.add("Maja");
        rodjendan.add("Milan");
        System.out.println(rodjendan);

        for(int i = 0; i< rodjendan.size(); i++){
            System.out.println(rodjendan.get(i));
        }





*/

        //Zadatak 36
        //Kreirati opstu listu "recenica"
        //Dodati clanove po iducem redosledu: "voli", 3, "Milovana", "Ana", true
        //Modifikovati listu tako da kada se odstampa da pise "Ana voli Milovana"


        ArrayList recenica = new ArrayList<>();
        recenica.add("voli");
        recenica.add(3);
        recenica.add("Milovana");
        recenica.add("Ana");
        recenica.add(true);

        recenica.remove(1);
        recenica.remove(recenica.size()-1);
        System.out.println(recenica);

        recenica.set(0, "Ana");
        recenica.set(1, "voli");
        recenica.set(2,"Milovana");

        System.out.println(recenica);
    }
}
