package oopvezbafs;

import java.util.ArrayList;

public class FejsPost {
   /* Kreirati klasu FejsPost koja ima:
    ime i prezime korisnika koji je stavio objavu
    tekst objave
    listu reakcija
    metodu reaguj, koja dodaje reakciju u listu
    privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
    metodu stampaj koja stampa info o postu u formatu:

    Dragoljub Boranijasevic
    Test ce biti u cetvrtak
    smajli 10 | like 15 | srce 2

    Iz glavne klase instancirati par reakcija i postova i ispisati info o postovima*/
    String imePrezime;
    String tekst;
    ArrayList<Emotikon> listaEmotikona;

    public FejsPost(String imePrezime, String tekst) {
        this.imePrezime = imePrezime;
        this.tekst = tekst;
        this.listaEmotikona = new ArrayList<>();
    }

    public void dajEmotikon(Emotikon e){
        listaEmotikona.add(e);
    }

    public int brojanje(String emotikon){
        int brojac = 0;
        for(int i = 0; i<listaEmotikona.size(); i++){
            if(listaEmotikona.get(i).getEmotikon().equalsIgnoreCase(emotikon)){
                brojac = brojac +1;
            }
        }
        System.out.println(brojac);
        return brojac;
    }

    public void stampa(){
        System.out.println(this.imePrezime);
        System.out.println(this.tekst);
        System.out.println(brojanje("srce"));
        for(int i = 0; i<listaEmotikona.size(); i++){
            System.out.println(listaEmotikona.get(i).getEmotikon()+listaEmotikona.get(i).getImePrezime());
        }
    }

}
