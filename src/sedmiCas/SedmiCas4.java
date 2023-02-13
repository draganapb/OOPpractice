package sedmiCas;

import java.util.ArrayList;

public class SedmiCas4 {
    public static void main(String[] args) {


                ArrayList lista = new ArrayList<>();
                lista.add("Vanja");
                lista.add("Vanja");
                lista.add("Mirko");
                lista.add("Vanja");
                lista.add("Sasa");
                lista.add("Vanja");
                lista.add("Vanja");

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }

                System.out.println("----------");

                for (int i = lista.size()-1; i >= 0; i--) {
                    if (lista.get(i).equals("Vanja")) {
                        lista.remove(i);
                    }
                }

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }




            }
        }






