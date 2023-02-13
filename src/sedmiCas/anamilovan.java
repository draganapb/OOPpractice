package sedmiCas;

import java.util.ArrayList;

public class anamilovan {
    public static void main(String[] args) {
        ArrayList recenica = new ArrayList<>();
        recenica.add("voli");
        recenica.add(3);
        recenica.add("Milovana");
        recenica.add("Ana");
        recenica.add(true);

        recenica.remove("Ana");
        for(int i = 0; i < recenica.size(); i++){
            System.out.println(recenica.get(i));

        }
        System.out.println(recenica);
    }
}
