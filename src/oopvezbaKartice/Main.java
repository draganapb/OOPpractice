package oopvezbaKartice;

public class Main {
    public static void main(String[] args) {
        Platna p1 = new Platna(20000, "12-45", 12, 2026);
        p1.dodajSredstva(200);
        p1.stampa();
        p1.izvrsiTransakciju(200);
        p1.stampa();

        Visa visa1 = new Visa(10000, "12/", 11, 2036, "milica milic");
        visa1.transakcija(1000);
        visa1.stampa();

    }
}
