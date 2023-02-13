package vezbanje_facebook;

import java.util.ArrayList;

public class FacebookPost {
    /*Kreirati klasu FacebookPost koja ima:
    ime i prezime korisnika koji je stavio objavu
    tekst objave
    listu reakcija
    metodu reaguj, koja dodaje reakciju u listu
    privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
    metodu stampaj koja stampa info o postu u formatu:*/
    private String imePrezime;
    private String objava;
    private ArrayList<Reakcije> listaReakcija;

    public FacebookPost(String imePrezime, String objava) {
        this.imePrezime = imePrezime;
        this.objava = objava;
        this.listaReakcija = new ArrayList<>();
    }

    public void reaguj(Reakcije r){
        listaReakcija.add(r);

    }
    public void stampa(){
        for(int i = 0; i<listaReakcija.size(); i++){
            System.out.println(listaReakcija.get(i).getTipReakcije());
        }
    }
    private int brojReakcija(String a){
        int brojac = 0;
        for(int i = 0; i< listaReakcija.size(); i++){
            if(listaReakcija.get(i).getTipReakcije().equalsIgnoreCase(a)){
                brojac = brojac + 1;
            }
        }
        return brojac;
    }
}
