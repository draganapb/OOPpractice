package KlaseRadnik;

public class Radnik {

    //OOP17 - Napraviti paket "KlaseRadnik" i dve klase - "Radnik" i "MainKlasa". U klasi Radnik deklarisati public atribute jmbg (tipa long),
    // ime i prezime (jedan string), broj dece, stepen strucne spreme i radni staz.
//Kreirati pun konstruktor za sve atribute
//Potrebno je izracunati da li je korisnik sposoban za kredit. Ako ima platu vecu od 40000 onda je true, ako ima ispod onda je false
//Platu racunamo tako sto ce se zbir koeficijenta i minulog rada pomnoziti sa 10 000 i na to dodati jos 2500
//Koeficijent se racuna zavisno od stepena strucne spreme preko switch-a
//Stepen strucne spreme moze biti 1,2,3,4 i koeficijent po tom redosledu je 1.03, 2.00, 2.88, 3.40
//Minuli rad se racuna zavisno od radnog staza. Ako je radni staz kraci od 10 godina onda je minuli rad 0.05. Ako je izmedju 10 i 20 onda je 0.75 i ako je duzi od 20 onda je 1.0
//Potrebno je izracunati i dane godisnjeg odmora tako sto ce se broj dece pomnoziti sa 2 i na to dodati 22 dana
//Podatke odstampati van MainKlase
//Svaka metoda, sem stampanja, treba biti return type

    long jmbg;
    String imePrezime;
    int brojDece;
    int stepenSpreme;
    int radniStaz;

    public Radnik(long jmbg, String imePrezime, int brojDece, int stepenSpreme, int radniStaz) {
        this.jmbg = jmbg;
        this.imePrezime = imePrezime;
        this.brojDece = brojDece;
        this.stepenSpreme = stepenSpreme;
        this.radniStaz = radniStaz;
    }

    public  double koeficijent(){
        switch(this.stepenSpreme) {
            case 1:
                return 1.03;

            case 2:
                return 2.00;
          //  break;

            case 3:
                return 2.88;
        //    break;

            case 4:
                return 3.40;
          //  break;

            default:
                System.out.println("Nije unet odgovarajuci broj strucne spreme");
                return 1.2;
        }
    }
    public double minuliStaz(){
        //Ako je radni staz kraci od 10 godina onda je minuli rad 0.05.
        // Ako je izmedju 10 i 20 onda je 0.75 i ako je duzi od 20 onda je 1.0
        double minuliRad;
        if(this.radniStaz<10 && this.radniStaz>=0){
            minuliRad = 0.05;
            return minuliRad;
        }
        else if(this.radniStaz>=10 && this.radniStaz<=20){
            minuliRad = 0.75;
            return minuliRad;
        }
        else{
            minuliRad = 1.0;
            return minuliRad;
        }


    }
    public double plata(){
        //Platu racunamo tako sto ce se zbir koeficijenta i minulog rada pomnoziti sa 10 000 i na to dodati jos 2500
        double plata = (minuliStaz()+koeficijent())*10000+2500;
        return plata;
    }
    public int daniGodisnjeg(){
        //Potrebno je izracunati i dane godisnjeg odmora tako sto ce se broj dece pomnoziti sa 2 i na to dodati 22 dana
        int godisnji = (this.brojDece*2)+22;
        return godisnji;

    }
    public boolean kredit(){
        boolean kreditOdobren = true;
        if(this.plata()>40000){
             kreditOdobren = true;
            return true;
        }
        else{
            return false;

        }
    }


    public void stampa(){
        if(kredit()){
            System.out.println("Kredit je odobren za " + this.imePrezime + " jmbg: " + this.jmbg);
            System.out.println("Ima platu od " + this.plata() + " dinara. Minuli rad iznosi " + this.minuliStaz() + "godina, a radni staz " + this.radniStaz + " godina." );
            System.out.println("Ima " + this.brojDece + " dece i " + this.daniGodisnjeg() + " dana godisnjeg odmora.");
        }

        else{
            System.out.println("Kredit nije odobren za " + this.imePrezime + " jmbg: " + this.jmbg);
            System.out.println("Ima platu od " + this.plata() + " dinara. Minuli rad iznosi " + this.minuliStaz() + "godina, a radni staz " + this.radniStaz + " godina." );
            System.out.println("Ima " + this.brojDece + " dece i " + this.daniGodisnjeg() + " dana godisnjeg odmora.");

        }
    }
}
