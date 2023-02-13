package OOP13;

public class Proizvod {//OOP14 - Kreirati klasu Proizvod koja ce imati atribute naziv kategorije i ID kategorije
//Kreirati klasu Telefon koja ce naslediti klasu Proizvod i imati atribut marka, model i cenu
//Kreirati klasu Televizor koja ce naslediti klasu Proizvod i imati atribut dijagonala i rezolucija


    String naziv;
    int ID;

    public Proizvod(String naziv, int ID) {
        this.naziv = naziv;
        this.ID = ID;
    }

    public  void stampa(){
        System.out.println(this.naziv + "ima ID: " + this.ID);
    }
}
