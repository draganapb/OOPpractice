package Osmicas;

import java.util.ArrayList;

public class cas8_9 {
    public static void main(String[] args) {


                ArrayList<Integer> lista1 = new ArrayList<>();
                ArrayList<String> lista2 = new ArrayList<>();
                stampanje(lista1);
                stampanje(lista2);

                lista1.add(1);
                lista2.add("name");
                stampanje(lista1);
                stampanje(lista2);

                lista1.add(9);
                lista1.add(11);
                lista1.add(0);
                lista2.add("password");
                stampanje(lista1);
                stampanje(lista2);

                lista1.remove(0);
                stampanje(lista1);

                lista1.remove(lista1.size()-1);
                stampanje(lista1);

            }

            public static void stampanje(ArrayList a) {
                for (int i = 0; i < a.size(); i++) {
                    System.out.println(a.get(i));
                }
                System.out.println("-------");
            }
        }
