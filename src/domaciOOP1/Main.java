package domaciOOP1;

public class Main {
    public static void main(String[] args) {
//Napraviti klasu Knjiga koja ce imati naziv i zanr.
        // U glavnoj klasi napraviti dve knjige, zatim proveriti da li imaju isti zanr i naziv,
        // ako imaju, ispisati poruku da je u pitanju ista knjiga, ako je samo zanr isti,
        // ispisati poruku koji je to zanr, ako nista od toga nije isto,
        // ispisati poruku da su u pitanju dve razlicite knjige.

        Knjiga knjiga1 = new Knjiga("Travnicka hronika", "istorijski");

        Knjiga knjiga2 = new Knjiga("Hari Poter", "naucna fantastika");

       if (knjiga1.naziv.equalsIgnoreCase(knjiga2.naziv) && knjiga1.zanr.equalsIgnoreCase(knjiga2.zanr)) {
            System.out.println("Knjige su iste");
        }
        else if(knjiga1.zanr.equalsIgnoreCase(knjiga2.zanr)){
            System.out.println("Knjige su istog zanra: " + knjiga1.zanr);
        }
        else if(knjiga1.naziv.equalsIgnoreCase(knjiga2.naziv)){
            System.out.println("Knjige su istog naziva " + knjiga1.naziv);
        }
        else{
            System.out.println("Knjige su razlicitog naziva i zanra");
        }

        //stampa(knjiga1, knjiga2);


    }

     /*   public static void stampa(Knjiga knjiga1, Knjiga knjiga2){
            if (knjiga1.naziv.equalsIgnoreCase(knjiga2.naziv) && knjiga1.zanr.equalsIgnoreCase(knjiga2.zanr)) {
                System.out.println("Knjige su iste");
            } else if (knjiga1.zanr.equalsIgnoreCase(knjiga2.zanr)) {
                System.out.println("Knjige su istog zanra: " + knjiga1.zanr);
            } else if (knjiga1.naziv.equalsIgnoreCase(knjiga2.naziv)) {
                System.out.println("Knjige su istog naziva " + knjiga1.naziv);
            } else {
                System.out.println("Knjige su razlicitog naziva i zanra");
            }
        }
        */

    }

