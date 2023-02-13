package OOPvezbanje5;

public class Main {
    public static void main(String[] args) {
       Cars auto1 = new Cars("Opel", "Korsa");
       auto1.setTipGoriva("dizel");
       auto1.setPredjeniKm(120);

        System.out.println(auto1.potrosnja(auto1.setTipGoriva("benzin"))); ;






    }
}
