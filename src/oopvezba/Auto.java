package oopvezba;

public class Auto {
    String marka = "audi";
    String model = "a6";
    int brzina = 200;

    public Auto(){

}
    public Auto(String marka, String model, int brzina) {
        this.marka = marka;
        this.model = model;
        this.brzina = brzina;
    }

    public  void stampa(){
        System.out.println("Auto je " + this.model + "model " + this.model + " i razvija brzinu od " + this.brzina + "km/h");
    }
}
