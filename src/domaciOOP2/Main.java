package domaciOOP2;

public class Main {
    public static void main(String[] args) {
        //Napraviti klasu Radnik koja ima ime, poziciju i platu. U glavnoj klasi napraviti dva radnika, proveriti
       // cija je plata veca, istampati informacije radnika cija je plata veca, uz 20% vecu platu.

        Radnik radnik1 = new Radnik("Milan Mirkov", "inzenjer", 200000);
        Radnik radnik2 = new Radnik("Ivana Kolarov", "doktor", 150000);

        poredjenje(radnik1, radnik2);

       /* if(radnik1.plata>radnik2.plata){
          radnik1.stampa();
        }
        else if(radnik1.plata==radnik2.plata){
            System.out.println("Radnici imaju istu platu");
        }
        else{
            radnik2.stampa();
        }
*/
    }
    public static void poredjenje(Radnik radnik1, Radnik radnik2){
        if(radnik1.plata>radnik2.plata){
            radnik1.stampa();
        }
        else if(radnik1.plata==radnik2.plata){
            System.out.println("Radnici imaju istu platu");
        }
        else{
            radnik2.stampa();
        }
    }
}
