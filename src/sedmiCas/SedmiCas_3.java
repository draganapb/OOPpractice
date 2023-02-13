package sedmiCas;

import java.util.ArrayList;

public class SedmiCas_3 {
    public static void main(String[] args) {

                ArrayList<String> namirnice = new ArrayList<>();

                namirnice.add("Hleb"); //index 0
                namirnice.add("Mleko"); //index 1
                namirnice.add("So"); //index 2
                namirnice.add("Novine"); //index 3
                namirnice.add("Zvake"); //index 4

                for (int i = 0; i < namirnice.size(); i++) {
                    System.out.println(namirnice.get(i) + " index: " + i);
                }

                System.out.println("------------");

                namirnice.remove(2);
                //Brisemo clana koji ima index 2

                for (int i = 0; i < namirnice.size(); i++) {
                    System.out.println(namirnice.get(i) + " index: " + i);
                }

                System.out.println("------------");

                namirnice.remove("Novine");
                //Brisemo clana koji ima naziv "Novine"

                for (int i = 0; i < namirnice.size(); i++) {
                    System.out.println(namirnice.get(i) + " index: " + i);
                }

                System.out.println("------------");

                namirnice.remove(namirnice.size()-1);
                //Brisemo poslednji clan

                for (int i = 0; i < namirnice.size(); i++) {
                    System.out.println(namirnice.get(i) + " index: " + i);
                }

            }
        }
