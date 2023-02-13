package OOP16_domaci3;

import java.util.ArrayList;

public class Korpa {
     /* Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
    Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
    Osim konstuktora definisati:
            - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.s
- metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
- metoda stampaj() - istampace sve namirnice iz liste.
    U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.*/
    ArrayList<Namirnica> listaNamirnica ;

    public Korpa() {
        this.listaNamirnica = new ArrayList<>();
    }
    public void dodavanjeSastojaka(Namirnica nn){
        listaNamirnica.add(nn);
    }
    public int sumaNamirnica(ArrayList<Namirnica>listaNamirnica){
        int suma = 0;
        for(int i = 0; i< listaNamirnica.size(); i++){
            suma = suma + listaNamirnica.get(i).getCena();
        }
        System.out.println("Suma namirnica u korpi je " + suma);
        return suma;
    }


  public boolean nalaziSe(String n){
        boolean nalaziSe =true;
        for(int i = 0;i< listaNamirnica.size(); i++){
            if(listaNamirnica.get(i).getNaziv().equalsIgnoreCase(n)){
                System.out.println("Namirnica postoji u korpi");
                return true;
            }
        }
                System.out.println("Namirnica ne postoji u korpi");
                return false;
    }





}
