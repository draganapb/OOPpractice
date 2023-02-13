package OOP12;

public class Main {
    public static void main(String[] args) {
        //OOP12 - Kreirati klasu Proizvod koja ce imati svoj naziv i ID koji ce biti u konstruktoru
//Zatim kreirati private atribute cena i popust (boolean)
//U Main metodi kreirati objekte
        Proizvod proizvod1 = new Proizvod("Cipele", 123);
        proizvod1.setPopust(false);
        proizvod1.setCena(3000);

        Proizvod proizvod2 = new Proizvod("Cizme", 456);
        proizvod2.setPopust(true);
        proizvod2.setCena(4000);
        proizvod1.stampa();


    }
}
