package OOPvezbanje5;

public class Cars {

   private int predjeniKm;
   private String tipGoriva;
   String model;
   String marka;


    public Cars(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }
public static int potrosnja(String gorivo){
        if(gorivo.equalsIgnoreCase("benzin")){
            return 10;
        }else{
            return 15;
        }


    }
    public  void stampa(){
        System.out.println("Auto marke" + this.marka+ " i modela " + this.model + "koristi" + getTipGoriva()+ " i ma potrosnju"
        +potrosnja(getTipGoriva()) + "i presao je " + getPredjeniKm());

    }

    public int getPredjeniKm() {
        return predjeniKm;
    }

    public void setPredjeniKm(int predjeniKm) {
        this.predjeniKm = predjeniKm;
    }

    public String getTipGoriva() {
        return tipGoriva;
    }

    public String setTipGoriva(String tipGoriva) {
        this.tipGoriva = tipGoriva;
        return tipGoriva;
    }

}
