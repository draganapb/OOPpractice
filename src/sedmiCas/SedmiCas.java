package sedmiCas;

import java.util.ArrayList;

public class SedmiCas {
    public static void main(String[] args) {



                ArrayList lista = new ArrayList<>();

                lista.add("Ime");
                lista.add(1);
                lista.add(true);
                lista.add(1.245);

                System.out.println(lista);

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }

                //-------------------

                ArrayList<String> listaStringova = new ArrayList<>();

                listaStringova.add("Novi string");
                listaStringova.add("2354");

                System.out.println(listaStringova);

            }
        }

