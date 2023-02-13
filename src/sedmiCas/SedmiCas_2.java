package sedmiCas;

import java.util.ArrayList;

public class SedmiCas_2 {
    public static void main(String[] args) {




                //Zadatak 35
                //Kreirati string listu sa imenima ljudi koji ce vam doci na rodjendan
                //Listu odstampati celu pa zatim svaki clan pojedinacno

                ArrayList<String> lista = new ArrayList<>();

                lista.add("Milan");
                lista.add("Marija");
                lista.add("Aleksa");
                lista.add("Dunja");

                System.out.println(lista);
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }


            }
        }











