package OOP2;

public class main {


        public static void main(String[] args) {

            Car automobil1 = new Car();
            System.out.println(automobil1.marka);
            System.out.println(automobil1.model);
            System.out.println(automobil1.godiste);
            System.out.println(automobil1.tipGoriva);
            System.out.println(automobil1.kilometraza);

            //Mogu da promenim kilometrazu zato sto ona nije final
            automobil1.kilometraza = 150000;

            System.out.println(automobil1.marka);
            System.out.println(automobil1.model);
            System.out.println(automobil1.godiste);
            System.out.println(automobil1.tipGoriva);
            System.out.println(automobil1.kilometraza);

            //Ne mogu da menjam atribute kada su oni u klasi final
            //automobil1.model = "A3";

        }
    }
