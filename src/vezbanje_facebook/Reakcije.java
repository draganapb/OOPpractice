package vezbanje_facebook;

public class Reakcije {

  //  Kreirati klasu Reakcija koja ima tip reakcije (smajli, like, srce),
  //  ime i prezime korisnika koji je reagovao, getere, setere i konstruktore.
  /*Kreirati klasu FacebookPost koja ima:
    ime i prezime korisnika koji je stavio objavu
    tekst objave
    listu reakcija
    metodu reaguj, koja dodaje reakciju u listu
    privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
    metodu stampaj koja stampa info o postu u formatu:*/

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public Reakcije(String tipReakcije, String imePrezime) {
        this.tipReakcije = tipReakcije;
        this.imePrezime = imePrezime;
    }

    private String tipReakcije;
    private String imePrezime;



}



