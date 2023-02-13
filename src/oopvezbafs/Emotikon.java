package oopvezbafs;

public class Emotikon {
    public Emotikon(String emotikon, String imePrezime) {
        this.emotikon = emotikon;
        this.imePrezime = imePrezime;
    }
  /*  Kreirati klasu Emotikon koja ima tip reakcije (smajli, like, srce),
    ime i prezime korisnika koji je reagovao, getere, setere i konstruktore.
*/


    private String emotikon;
    private String imePrezime;

    public void setEmotikon(String emotikon) {
        this.emotikon = emotikon;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getEmotikon() {
        return emotikon;
    }

    public String getImePrezime() {
        return imePrezime;
    }


   /*@Override
    public String toString() {
        return this.emotikon +
                this.imePrezime;


    }*/


}
