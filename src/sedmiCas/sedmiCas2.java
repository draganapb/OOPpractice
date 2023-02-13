package sedmiCas;

import java.util.ArrayList;

public class sedmiCas2 {
    public static void main(String[] args) {
        //Zadatak 35
//Kreirati string listu sa imenima ljudi koji ce vam doci na rodjendan
//Listu odstampati celu pa zatim svaki clan pojedinacno


        ArrayList<String> listaLjudi = new ArrayList<>();
        listaLjudi.add("Dejana Rodic");
        listaLjudi.add("Marko Maric");
        listaLjudi.add("Ana Milic");

        for (int i = 0; i < listaLjudi.size();i++){
            System.out.println(listaLjudi.get(i));
        }

        System.out.println((listaLjudi));
    }
}
