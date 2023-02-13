package OOP13;

public class Main {//OOP14 - Kreirati klasu Proizvod koja ce imati atribute naziv kategorije i ID kategorije
//Kreirati klasu Telefon koja ce naslediti klasu Proizvod i imati atribut marka, model i cenu
//Kreirati klasu Televizor koja ce naslediti klasu Proizvod i imati atribut dijagonala i rezolucija

    public static void main(String[] args) {


        Proizvod p1 = new Proizvod("televizor", 123);

        p1.stampa();

        Telefon t1 = new Telefon("Samsung", 456, "a56", "edge", 10000);
        t1.stampa();
        Televizor tel1 = new Televizor("Tesla", 462, 1024, 156);
tel1.stampa();

    }
}
