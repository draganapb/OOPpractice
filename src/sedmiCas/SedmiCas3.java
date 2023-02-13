package sedmiCas;

import java.util.ArrayList;

public class SedmiCas3 {
    public static void main(String[] args) {
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

        recenica.set(0, "Ana");
        recenica.set(1, "voli");
        recenica.set(2, "Milovana");



        for(int i = 0; i< recenica.size(); i++){
            System.out.println(recenica);
        }

//
























    }
}
