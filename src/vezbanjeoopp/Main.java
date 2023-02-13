package vezbanjeoopp;

public class Main {
    public static void main(String[] args) {
        Radnik fizikalac = new Radnik(123,"Milica", 4,10000);
        Radnik sefSmene = new Radnik(234, "djuro", 4, 10000);

        Fizikalac fizikalac1 = new Fizikalac(fizikalac.id, fizikalac.nazivRadnika, fizikalac.godIskustva, fizikalac.plata);
        fizikalac.plata();
        fizikalac1.plata();

        SefSmene sef1= new SefSmene(sefSmene.id, sefSmene.nazivRadnika, sefSmene.godIskustva, sefSmene.plata);
        SefSmene sef2 = new SefSmene(555, "k", 8, 10000);
        sef2.plata();

        Investitor i1 = new Investitor(555, "ik", 12, 10000, 9);
        i1.stampa();
    }
}
