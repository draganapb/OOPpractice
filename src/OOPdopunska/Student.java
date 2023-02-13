package OOPdopunska;

public class Student {
    /*Kreirati klasu Student, koja ima promenljive za njegov broj indeksa, naziv departmana i prosecnom ocenom,
    kreirati sve potrebne get i set metode.
    Kreirati klasu Fakultet koja ima listu Studenata.Napisati metode za:
            - Izlistavanje svih studenata nekog odredjenog departmana
- Racunanje sume prosecnih ocena sa jednog departmana
- Izbacivanje ucenika sa fakulteta ukoliko mu je prosecna ocena manja od zadovoljavajuce.*/
    private int brojIndeksa;
    private String nazivDepartmana;
    private double prosecnaOcena;

    public Student(int brojIndeksa, String nazivDepartmana, double prosecnaOcena) {
        this.brojIndeksa = brojIndeksa;
        this.nazivDepartmana = nazivDepartmana;
        this.prosecnaOcena = prosecnaOcena;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivDepartmana() {
        return nazivDepartmana;
    }

    public void setNazivDepartmana(String nazivDepartmana) {
        this.nazivDepartmana = nazivDepartmana;
    }

    public double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        this.prosecnaOcena = prosecnaOcena;
    }

    @Override
    public String toString() {
        return "Student{" +
                "brojIndeksa=" + brojIndeksa +
                ", departman='" + nazivDepartmana + '\'' +
                ", prosecnaOcena=" + prosecnaOcena +
                '}';
    }
}

