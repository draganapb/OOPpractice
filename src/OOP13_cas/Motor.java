package OOP13_cas;

public class Motor extends MotornoVozilo{


        String tipMotora;

        public Motor(int brojTockova, int brojVrata, String boja, String tipMotora) {
            super(brojTockova, brojVrata, boja);
            this.tipMotora = tipMotora;
        }

        public void stampa() {
            System.out.println("Ovo je " + this.tipMotora + " tip motora.");
        }
    }
