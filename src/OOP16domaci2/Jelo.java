package OOP16domaci2;

import java.util.ArrayList;

public class Jelo {
    // Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.
    // Klase Corba, Torta i Sarma nasledjuju klasu Jelo. Ukoliko je jedan od sastojaka mleko,
    // podesicemo boolean vrednost za laktozu na false, u suprotnom na true.
    // U main klasi kreirati i istampati bar tri jela (njihov naziv, sastojke i da li lactose-free).
    String naziv;
    ArrayList<String>Sastojci = new ArrayList<>();
    boolean bezLaktoze;

    public Jelo(String naziv, ArrayList<String> sastojci) {
        this.naziv = naziv;
        this.Sastojci = sastojci;
        this.bezLaktoze =   true;
    }

    public void stampa(){
        for(int i = 0; i< this.Sastojci.size(); i++) {
            if (this.Sastojci.get(i).equalsIgnoreCase("mleko")) {
                this.bezLaktoze = false;

            }
        }
            if(this.bezLaktoze) {
                System.out.println(this.naziv + " od sastojaka ima " + this.Sastojci + " i  lactose - free je");
            }else{
                System.out.println(this.naziv + " od sastojaka ima " + this.Sastojci + " i nije lactose - free");

            }



    }
}
