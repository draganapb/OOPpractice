package OOP22;

public class VideoPlayer {
    /* Kreirati klasu VideoPlayer koja ima
     private atribute duzina videa, jacina zvuka, trenutno vreme videa i kvalitet videa
     kreirati pun konstruktor, getere, setere i metodu koja ce da stampa u formatu
     Trenutno vreme videa:
     Trenutna jacina zvuka:
     Trenutni kvalitet videa:

     */
    private int duzinaVidea;
    private int jacinaZvuka;
    private int trenutnoVremeVidea;

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea() {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public VideoPlayer(int duzinaVidea, int jacinaZvuka, int trenutnoVremeVidea, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.kvalitetVidea = kvalitetVidea;
    }

    private int kvalitetVidea;


    //Trenutno vreme videa:
    //    Trenutna jacina zvuka:
    //    Trenutni kvalitet videa:
    public void stampa() {
        System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea);
        System.out.println("Trenutna jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Trenutni kvalitet videa: " + this.kvalitetVidea);
    }
}

