package OOP19_cas_parentPozivanje;

public class Child extends Parent{


        //Parent je parent klasa u odnosu na Child i u metodi za stampu mogu da pozovem metodu iz
        //Parent tako sto pre naziva metoda dodam prefix super.
        public void stampa() {
            super.stampa();
        }
    }

