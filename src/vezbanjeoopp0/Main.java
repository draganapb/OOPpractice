package vezbanjeoopp0;

public class Main {
    public static void main(String[] args) {
        //Napraviti klasu Radnik koja ima ime, poziciju i platu. U glavnoj klasi napraviti dva radnika, proveriti
        // cija je plata veca, istampati informacije radnika cija je plata veca, uz 20% vecu platu.

        Radnik radnik1 = new Radnik("goran", "inzenjer", 10000);
        Radnik radnik2 = new Radnik("ggg", "doktor", 100000);

        radnik1.provera(radnik1, radnik2);
        if(radnik1.plata>radnik2.plata){
            radnik1.stampa();
        }
        else{
            radnik2.stampa();
        }







    }
}
