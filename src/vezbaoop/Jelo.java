package vezbaoop;

import java.util.ArrayList;

public class Jelo {
    // Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.
    // Klase Corba, Torta i Sarma nasledjuju klasu Jelo. Ukoliko je jedan od sastojaka mleko,
    // podesicemo boolean vrednost za laktozu na false, u suprotnom na true.
    // U main klasi kreirati i istampati bar tri jela (njihov naziv, sastojke i da li lactose-free).

    String naziv;
    ArrayList<String> listaSastojaka=new ArrayList<>();
    boolean bezLaktoze;

    public Jelo(String naziv, ArrayList<String> listaSastojaka) {
        this.naziv = naziv;
        this.listaSastojaka = listaSastojaka;
        this.bezLaktoze = true;
    }
    public void stampa(){
        for(int i = 0; i < this.listaSastojaka.size(); i++){
            System.out.println(this.listaSastojaka.get(i));
            if(this.listaSastojaka.get(i).equalsIgnoreCase("mleko")){
                this.bezLaktoze = false;
            }
        }
        if(this.bezLaktoze){
            System.out.println("U listi se ne nalazi mleko");
        }
        else{
            System.out.println("nalazi se mleko");
        }



    }


}
