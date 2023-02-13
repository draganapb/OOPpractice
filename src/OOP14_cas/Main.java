package OOP14_cas;

public class Main {
    public static void main(String[] args) {


                //OOP14 - Kreirati klasu Proizvod koja ce imati atribute naziv kategorije i ID kategorije
                //Kreirati klasu Telefon koja ce naslediti klasu Proizvod i imati atribut marka, model i cenu
                //Kreirati klasu Televizor koja ce naslediti klasu Proizvod i imati atribut dijagonala i rezolucija

                Proizvod telefon = new Proizvod("Telefon", 778892);
                Proizvod televizor = new Proizvod("Televizor", 789024);

                Telefon t1 = new Telefon(telefon.nazivKategorije, telefon.IDKategorije, "Samsung", "S22", 1200);
                t1.stampa();
                Telefon t2 = new Telefon(telefon.nazivKategorije, telefon.IDKategorije, "Apple", "14 Pro Max", 2000);
                t2.stampa();

                Televizor tv1 = new Televizor(televizor.nazivKategorije, televizor.IDKategorije, 32, "4K");
                tv1.stampa();
                Televizor tv2 = new Televizor(televizor.nazivKategorije, televizor.IDKategorije, 55, "8K");
                tv2.stampa();

                //------------------
                //Objekti bez objekata iz parent klase

                Telefon t3 = new Telefon("Tel.", 1098097, "Xiaomi", "Redmi", 800);
                t3.stampa();
                Televizor tv3 = new Televizor("TV", 90782, 65, "4K");
                tv3.stampa();


            }
        }
