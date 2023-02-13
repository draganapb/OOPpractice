package Osmicas;

public class osmiCas3 {
    public static void main(String[] args) {
        //Zadatak 47 - U main metodi pozvati metodu gde prosledjujete ime i godiste, a druga metoda stampa
        //ime korisnika i koliko ima godina

               podaci("Milica", 1990);
               podaci("Milos", 1969);
    }

    public static void podaci(String a, int g){
         g = 2022 - g;
        System.out.println("Korisnik se zove " + a + " i ima " + g + " godina");
    }

}
