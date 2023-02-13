package OOP16_domaci3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         /* Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
    Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
    Osim konstuktora definisati:
            - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
- metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
- metoda stampaj() - istampace sve namirnice iz liste.
    U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.*/

        Namirnica hleb = new Namirnica("beli hleb", 100);
        Namirnica mleko = new Namirnica("kiselo mleko", 120);
        Namirnica sir = new Namirnica("trapist sir", 560);

        Korpa korpa1 = new Korpa();
        korpa1.dodavanjeSastojaka(hleb);
        korpa1.dodavanjeSastojaka(mleko);
        korpa1.dodavanjeSastojaka(sir);

        korpa1.sumaNamirnica(korpa1.listaNamirnica);

        korpa1.nalaziSe("kajmak");
        korpa1.nalaziSe("kiselo mleko");
    }
}
