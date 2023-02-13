package OOP15_cas;

public class QA extends Firma{

        boolean automation;
        int godineIskustva;

        public QA(String nazivPozicije, int pocetnaPlata, boolean automation, int godineIskustva) {
            super(nazivPozicije, pocetnaPlata);
            this.automation = automation;
            this.godineIskustva = godineIskustva;
        }

        public void stampa() {
            if (automation) {
                System.out.println("QA ima " + this.godineIskustva + " godina iskustva u automatizaciji.");
            } else {
                System.out.println("QA ima " + this.godineIskustva + " godina iskustva u manuelnom testiranju.");
            }
        }
    }

