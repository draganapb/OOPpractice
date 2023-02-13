package OOP15_cas;

public class Mentee extends QA{

        String imeMentora;

        public Mentee(String nazivPozicije, int pocetnaPlata, boolean automation, int godineIskustva, String imeMentora) {
            super(nazivPozicije, pocetnaPlata, automation, godineIskustva);
            this.imeMentora = imeMentora;
        }

        public void stampa() {
            System.out.println("Mentor zaposlenom je " + this.imeMentora);
        }
    }

