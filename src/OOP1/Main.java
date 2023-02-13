package OOP1;

public class Main {


        public static void main(String[] args) {

            Car automobil = new Car();
            //Kreiramo objekat iz klase Car
            System.out.println(automobil.marka);

            automobil.marka = "Fiat";
            //Menjamo atribut naseg objekta
            System.out.println(automobil.marka);

            Car automobil2 = new Car();
            //Kreiramo novi objekat iz klase Car
            System.out.println(automobil2.marka);

            System.out.println(automobil);
            //Ako odstampamo samo objekat dobicemo njegov ID



        }
    }

