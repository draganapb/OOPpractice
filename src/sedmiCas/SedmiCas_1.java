package sedmiCas;

import java.util.ArrayList;

public class SedmiCas_1 {
    public static void main(String[] args) {

                //Kreirati opstu listu sa vasim podacima (ime, godine, visina u metrima i boolean da li ucite javu
                //Listu odstampati celu pa zatim svaki clan pojedinacno

                ArrayList lista = new ArrayList<>();

                lista.add("Dragoljub");
                lista.add(30);
                lista.add(1.88);
                lista.add(true);

                System.out.println(lista);

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }

                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).equals(true)) {
                        System.out.println("Da li ucite javu? " + lista.get(i));
                    }
                }


            }
        }











