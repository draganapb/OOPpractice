package OOPvezbanje4;

public class Cars {
    private String tipGoriva;
    private int predjeniKm;
    String model;
    String marka;

    public String getTipGoriva() {
        return tipGoriva;
    }

    public void setTipGoriva(String tipGoriva) {
        this.tipGoriva = tipGoriva;
    }

    public int getPredjeniKm() {
        return predjeniKm;
    }

    public void setPredjeniKm(int predjeniKm) {
        this.predjeniKm = predjeniKm;
    }

    public Cars(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }
    public static int potrosnja(String gorivo){
        if(gorivo.equalsIgnoreCase("benzin")){
            return 15;
        }
        else{
            return 2;
        }
    }

    public void stampa(){
        System.out.println("Auto marke" + this.marka+ " i modela " + this.model);
        System.out.println("Ima tip goriva: " + getTipGoriva());
        System.out.println("i potrosnju od " + potrosnja(getTipGoriva()));
    }
}
