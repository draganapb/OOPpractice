package sedmiCas;

import java.util.ArrayList;

public class SedmiCas7 {
    public static void main(String[] args) {

//KADA IZ JEDNE LISTE UZIMAMO PODATKE I UBACUJEMO IH U DRUGU LISTU
                ArrayList lista = new ArrayList<>();

                lista.add("plava");
                lista.add("crvena");
                lista.add(123);
                lista.add("zuta");
                lista.add(false);
                lista.add("bela");
                lista.add("Milos");

                Object broj = lista.get(1);
                System.out.println(broj);

                ArrayList zastava = new ArrayList<>();

                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).equals("crvena") || lista.get(i).equals("plava") || lista.get(i).equals("bela")) {
                        zastava.add(lista.get(i));
                    }
                }

                System.out.println(zastava);



            }
        }






