public class PrviCas3 {
    public static void main(String[] args) {

        String stringZaStampu = "Dobrodosli na kurs";
        System.out.println(stringZaStampu);
        //skracenica za stampanje je sout + ENTER da se otkuca System.out.println

        System.out.print("Prvi string");
        System.out.print("Drugi string");
        System.out.print("Treci string");

        System.out.println("Cetvrti string");
        System.out.println("Peti string");
        System.out.println("Sesti string");

        //--------------------------------

        int x = 1;
        int y = 2;
        System.out.println(x+y);
        //Dva broj mozemo da saberemo sa znakom +

        String a = "Jedan";
        String b = "Dva";
        System.out.println(a+b);
        //Dva stringa cemo spojiti u jedan sa znakom +

        //-------------------------------

        int s = 10;
        int d = 2;
        int f = s+d;
        System.out.print("Sabiranjem brojeva " + s + " i " + d + " dobijamo: ");
        System.out.println(f);

        System.out.println("Deljenjem brojeva " + s + " i " + d + " dobijamo: " + (s/d));

        //------------------------------

        int c = 5;
        double v = 3;
        double n = c/v;
        System.out.println("Rezultat je " + n);


    }
}