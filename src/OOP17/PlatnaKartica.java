package OOP17;

public class PlatnaKartica {
    /*
    Napravi klasu Platna kartica koja ce imati atribute
    suma, broj kartice, mesec i godina
    Metodu dodajSredstva koja ce dodavati sredstva za unetu vrednost
    Metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna
    Metodu koja stampa podatke o kartici u formatu:
            7105-1579-5191-6184, 11/2024, $212
    Za klasu Platna kartica napraviti samo getere
    */

        double suma;
        String brojKartice;
        int mesec;
        int godina;


    public PlatnaKartica(double suma, String brojKartice, int mesec, int godina) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.mesec = mesec;
        this.godina = godina;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }


    public double dodavanje(double x){
        this.suma = this.suma + x;
        System.out.println("Dodali ste $" + x + " i trenutni iznos na racunu je " + "$" + this.suma);
        return this.suma;


    }
    public double izvrsiTransakciju(double y){
        this.suma = this.suma - y;
        return this.suma;
    }
    public void stampa(){
        //7105-1579-5191-6184, 11/2024, $212
        System.out.println(this.brojKartice + ", " + this.mesec + "/"+ this.godina + ", " + "$" +this.suma );

    }
}
