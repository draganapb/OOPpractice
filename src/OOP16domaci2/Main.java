package OOP16domaci2;

import java.util.ArrayList;

public class Main {
   // Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.
    // Klase Corba, Torta i Sarma nasledjuju klasu Jelo. Ukoliko je jedan od sastojaka mleko,
    // podesicemo boolean vrednost za laktozu na false, u suprotnom na true.
   // U main klasi kreirati i istampati bar tri jela (njihov naziv, sastojke i da li lactose-free).

    public static void main(String[] args) {
        ArrayList<String>sastojci = new ArrayList<>();
        sastojci.add("kumin");
        sastojci.add("mleko");
        Corba corba1 = new Corba("corba s kuminom", sastojci);
        corba1.stampa();

        sastojci = new ArrayList<>();
        sastojci.add("krompir");
        sastojci.add("luk");
        sastojci.add("grasak");
        sastojci.add("paradajz");
        Corba corba2 = new Corba("corba s povrcem", sastojci);
        corba2.stampa();

        sastojci = new ArrayList<>();
        sastojci.add("cokolada");
        sastojci.add("visnje");
        sastojci.add("mleko");
        sastojci.add("keks");
        Torta torta1 = new Torta("vocna torta", sastojci);
        torta1.stampa();

        sastojci = new ArrayList<>();
        sastojci.add("kupus");
        sastojci.add("mleveno meso");
        sastojci.add("luk");
        Sarma sarma1 = new Sarma("Sarma", sastojci);
        sarma1.stampa();

    }
}

