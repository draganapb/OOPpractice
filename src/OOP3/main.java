package OOP3;

public class main {
    public static void main(String[] args) {

                Student student1 = new Student();
                System.out.println("Ime: " + student1.ime);
                System.out.println("Prezime: " + student1.prezime);
                System.out.println("Broj indexa: " + student1.brojIndexa);
                System.out.println("Broj polozenih ispita u junu: " + student1.brojPolozenihIspita);

                student1.brojPolozenihIspita = student1.brojPolozenihIspita + 2;
                System.out.println("Broj polozenih ispita u septembru: " + student1.brojPolozenihIspita);

                //-----------------------
                System.out.println("Drugi student:");

                Student student2 = new Student();
                System.out.println("Ime: " + student2.ime);
                System.out.println("Prezime: " + student2.prezime);
                System.out.println("Broj indexa: " + student2.brojIndexa);
                System.out.println("Broj polozenih ispita u junu: " + student2.brojPolozenihIspita);
            }
        }
