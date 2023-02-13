package SestiCas;

public class sestiCas_5 {
    public static void main(String[] args) {


                //Kreirati spisak zaposlenih ljudi

                String spisak[] = new String[5];
                spisak[0] = "Marko";
                spisak[1] = "Andjela";
                spisak[2] = "Milica";
                spisak[3] = "Petar";
                //spisak[4] = "Vanja";

                for (int i = 0; i < spisak.length; i++) {
                    System.out.println("Na " + (i+1) + ". poziciji zaposlen je " + spisak[i]);
                }

                spisak[3] = "Uros";

                for (int i = 0; i < spisak.length; i++) {
                    System.out.println("Na " + (i+1) + ". poziciji zaposlen je " + spisak[i]);
                }

                //Kada imamo niz od brojeva - pocetna vrednost je 0
                //Kada imamo niz od stringova - pocetna vrednost je null
                //Kada imamo niz od booleana - pocetna vrednost je false

                // 1 - pun tanjir
                // 0 - prazan tanjir
                // null - nemamo tanjir (tanjir ne postoji)

            }
}




























