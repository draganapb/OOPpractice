package Osmicas;

public class cas8_2 {
    public static void main(String[] args) {


                //Main metoda nam sluzi kao motor
                //Ne mozemo da pokrenemo program bez main metode
                //Sluzi nam da pozivamo druge metode
                //Takodje druge metode mogu da pozovu ostale ukoliko su static

                metoda1(); //Pozivamo metodu koja u sebi ima stampanje i onda cemo u konzoli dobiti tu stampu
                metoda2(); //Pozivam metodu ali ne dobijam nikakav ispis jer je vracena vrednost string
                System.out.println(metoda2()); //Tek stampanjem metode mogu da vidim njenu vrednost
                //metoda2() == "Hello world!";

                int zbir = metoda3() + metoda3(); //isto kao da smo napisali 1 + 1 jer metoda3() == 1
                //zbog return-a te metode
                System.out.println(zbir);

            }

            //Metoda tipa void ne vraca nikakvu vrednost
            //Ne mozemo da stampamo ovu metodu u drugoj metodi
            //Mozemo da radimo stampanje UNUTAR te metode i da se taj prikaz odradi preko main metode
            public static void metoda1() {
                System.out.println("Ispis iz prve metode");
            }

            //Kada metoda ima tip (String, int, boolean ...)
            //onda u toj metodi mora da postoji return
            //taj return mora da vrati ISTU vrednost kog je tipa metoda
            //dakle String metoda mora da vrati String, ne moze da vrati drugi tip
            public static String metoda2() {
                int tri = 3;
                String jedan = "Hello world!";
                String dva = " neki drugi string";
                return jedan;
            }

            //Kada postoji return, onda pozivanjem metode u nekoj drugoj metodi dobijamo tu vrednost
            //Ako pozovemo metoda3() u nekoj metodi ce biti isto kao da smo pozvali broj 1 (zato sto je to u return)
            public static int metoda3() {
                return 1;
            }

            //Metoda koja nema static ne moze biti vidljiva u drugim metodama
            public boolean metoda4() {
                return true;
            }



        }
