package domaciOOP1;

public class Knjiga {
    //Napraviti klasu Knjiga koja ce imati naziv i zanr.
    // U glavnoj klasi napraviti dve knjige, zatim proveriti da li imaju isti zanr i naziv,
    // ako imaju, ispisati poruku da je u pitanju ista knjiga, ako je samo zanr isti,
   // ispisati poruku koji je to zanr, ako nista od toga nije isto,
    // ispisati poruku da su u pitanju dve razlicite knjige.

    String naziv;
    String zanr;


    public Knjiga(String naziv, String zanr) {
        this.naziv = naziv;
        this.zanr = zanr;
    }


    }

