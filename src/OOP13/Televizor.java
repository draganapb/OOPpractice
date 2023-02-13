package OOP13;

public class Televizor extends Proizvod{//OOP14 - Kreirati klasu Proizvod koja ce imati atribute naziv kategorije i ID kategorije
//Kreirati klasu Telefon koja ce naslediti klasu Proizvod i imati atribut marka, model i cenu
//Kreirati klasu Televizor koja ce naslediti klasu Proizvod i imati atribut dijagonala i rezolucija

    int dijagonala;
    int rezolucija;

    public Televizor(String naziv, int ID, int dijagonala, int rezolucija) {
        super(naziv, ID);
        this.dijagonala = dijagonala;
        this.rezolucija = rezolucija;
    }
    public void stampa(){
        System.out.println(this.naziv + "ima dijagonalu od " + this.dijagonala);
    }
}
