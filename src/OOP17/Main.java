package OOP17;

public class Main {
    public static void main(String[] args) {

        PlatnaKartica platna = new PlatnaKartica(20000, "7105-1579-5191-6184", 10, 2022);
            platna.dodavanje(250);
            platna.izvrsiTransakciju(250);
            platna.stampa();

        VisaKartica visa1 = new VisaKartica(25000, "7856-1236-9632-4569", 11,2025,"Milica Peric");
            visa1.transakcijaProvizija(10000);
            visa1.transakcijaProvizija(50);
            visa1.stampa();


        MasterKartica master1 = new MasterKartica(100000, "7856-3698-2587-1234", 05, 2026);
            master1.transakcijaProvizija(10000);
            master1.odrzavanjeRacuna();
            master1.stampa();




    }
}
