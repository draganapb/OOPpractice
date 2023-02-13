package OOP13;

public class Telefon extends Proizvod{
    //OOP14 - Kreirati klasu Proizvod koja ce imati atribute naziv kategorije i ID kategorije
    //Kreirati klasu Telefon koja ce naslediti klasu Proizvod i imati atribut marka, model i cenu
//Kreirati klasu Televizor koja ce naslediti klasu Proizvod i imati atribut dijagonala i rezolucija


    String marka;
    String model;

    public Telefon(String naziv, int ID, String marka, String model, int cena) {
        super(naziv, ID);
        this.marka = marka;
        this.model = model;
        this.cena = cena;
    }

    int cena;
    public void stampa(){
        System.out.println(this.naziv + "kosta" + this.cena);
    }

    }

