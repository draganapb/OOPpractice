package oopvezbaKartice;

public class Platna {
   /* Napravi klasu Platna kartica koja ce imati atribute
    suma, broj kartice, mesec i godina
    Metodu dodajSredstva koja ce dodavati sredstva za unetu vrednost
    Metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna
    Metodu koja stampa podatke o kartici u formatu:
            7105-1579-5191-6184, 11/2024, $212
    Za klasu Platna kartica napraviti samo getere*/
    private double suma;
    private String brojKartice;
    int mesec;
    int godina;

    public Platna(double suma, String brojKartice, int mesec, int godina) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.mesec = mesec;
        this.godina = godina;
    }
    public void dodajSredstva(int x){
        this.suma = this.suma + x;
    }
    public void izvrsiTransakciju(double x){
        this.suma = this.suma - x;
    }
    public void stampa(){

        System.out.println(this.suma);
    }
}
