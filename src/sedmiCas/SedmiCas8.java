package sedmiCas;

import java.util.ArrayList;

public class SedmiCas8 {
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
                System.out.println(recenica);
        /*recenica.remove(1);
        recenica.remove(recenica.size()-1);*/
        for (int i = recenica.size()-1; i >=0 ; i--) {
                    if (!(recenica.get(i).equals("Ana") || recenica.get(i).equals("voli") || recenica.get(i).equals("Milovana"))) {
                        recenica.remove(i);
                    }
                }
                //voli, Milovana, Ana
                //  0      1       2
                Object rezerva = recenica.get(0);
                recenica.set(0, recenica.get(2));
                recenica.set(2, recenica.get(1));
                recenica.set(1, rezerva);
                for (int i = 0; i < recenica.size(); i++) {
                    System.out.print(recenica.get(i) + " ");
                }

            }
        }













