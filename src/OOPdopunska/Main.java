package OOPdopunska;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      /*  Kreirati klasu Student, koja ima promenljive za njegov broj indeksa, naziv departmana i prosecnom ocenom,
      kreirati sve potrebne get i set metode.
        Kreirati klasu Fakultet koja ima listu Studenata.Napisati metode za:
        - Izlistavanje svih studenata nekog odredjenog departmana
                - Racunanje sume prosecnih ocena sa jednog departmana
        - Izbacivanje ucenika sa fakulteta ukoliko mu je prosecna ocena manja od zadovoljavajuce.*/

        Student student1 = new Student(1233, "istorija", 7.5);
        Student student2 = new Student(235, "istorija", 9.6);
        Student student3 = new Student(456, "hemija", 8.2);
        Student student4 = new Student(777, "hemija", 9.5);
        Student student5 = new Student(1234, "hemija", 5);


        Fakultet f1 = new Fakultet();
        f1.listaStudenata.add(student1);
        f1.listaStudenata.add(student2);
        f1.listaStudenata.add(student3);
        f1.listaStudenata.add(student4);
        f1.listaStudenata.add(student5);
        // f1.izlistavanje("istorija");
        // f1.izlistavanje("hemija");
       //    System.out.println(f1.racunanjeOcena("hemija"));
        f1.izbacivanje(6);
        f1.izlistavanje("hemija");

    }
}
