package OOP16domaci2;

import java.util.ArrayList;

public class Torta extends Jelo{
    // Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.
    // Klase Corba, Torta i Sarma nasledjuju klasu Jelo. Ukoliko je jedan od sastojaka mleko,
    // podesicemo boolean vrednost za laktozu na false, u suprotnom na true.
    // U main klasi kreirati i istampati bar tri jela (njihov naziv, sastojke i da li lactose-free).

    public Torta(String naziv, ArrayList<String> sastojci) {
        super(naziv, sastojci);
    }
}
