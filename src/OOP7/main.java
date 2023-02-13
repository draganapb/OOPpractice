package OOP7;

public class main {
    public static void main(String[] args) {

        film film1 = new film();
        film1.naziv = "Poslednji ples";
        film1.vremeTrajanja= 128;
        film1.zanr="komedija";

        System.out.println("Naziv filma: " + film1.naziv);
        System.out.println("Trajanje filma: " + film1.vremeTrajanja  + " minuta");
        System.out.println("Zanr filma: " + film1.zanr);
    }
}
