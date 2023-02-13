package OOPdopunska;

import java.util.ArrayList;

public class Fakultet {
  /*  Kreirati klasu Student, koja ima promenljive za njegov broj indeksa, naziv departmana i prosecnom ocenom, kreirati sve potrebne get i set metode.
    Kreirati klasu Fakultet koja ima listu Studenata.Napisati metode za:
            - Izlistavanje svih studenata nekog odredjenog departmana
- Racunanje sume prosecnih ocena sa jednog departmana
- Izbacivanje ucenika sa fakulteta ukoliko mu je prosecna ocena manja od zadovoljavajuce.*/


    ArrayList<Student> listaStudenata;

    public Fakultet() {
        this.listaStudenata = new ArrayList<>();
    }

    public void izlistavanje(String departman) {
        for (int i = 0; i < listaStudenata.size(); i++) {
            if (listaStudenata.get(i).getNazivDepartmana().equalsIgnoreCase(departman)) {
                System.out.println(listaStudenata.get(i));
            }
        }
    }

    public double racunanjeOcena(String departman) {
        double suma = 0;
        int brojac = 0;
        for (int i = 0; i < listaStudenata.size(); i++) {
            if (listaStudenata.get(i).getNazivDepartmana().equalsIgnoreCase(departman)) {
                suma = (suma + listaStudenata.get(i).getProsecnaOcena());
                brojac = brojac + 1;
            }

        }
        return suma / brojac;
    }

    public void izbacivanje(double ocena) {
        for (int i = listaStudenata.size() - 1; i >= 0; i--) {
            if (listaStudenata.get(i).getProsecnaOcena() < ocena) {
                listaStudenata.remove(listaStudenata.get(i));
            }
        }


    }

    public boolean jeUListi(Student s) {
        boolean rez = false;
        for(int i = 0; i<listaStudenata.size(); i++) {
            if(listaStudenata.get(i).equals(s)) {
                rez = true;
                break;
            }
        }
        return rez;
    }




}
