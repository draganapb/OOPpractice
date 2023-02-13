package vezbaoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String>listaSastojaka = new ArrayList<>();
        Jelo corba = new Jelo("corba",listaSastojaka);
        Jelo torta = new Torta("torta", listaSastojaka);

        listaSastojaka = new ArrayList<>();
        listaSastojaka.add("hleb");
        listaSastojaka.add("mleko");
        Corba corba1 = new Corba("corba s povrcem", listaSastojaka);
        listaSastojaka.add("pasulj");
         listaSastojaka.add("kupus");
        System.out.println(corba1.listaSastojaka);
        corba1.stampa();

        listaSastojaka = new ArrayList<>();
        Torta torta1 = new Torta("vocna torta", listaSastojaka);
        listaSastojaka.add("cokolada");
        listaSastojaka.add("slag");
        listaSastojaka.add("mleko");
        torta1.stampa();


    }
}
