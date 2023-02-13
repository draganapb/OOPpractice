package OOP3_1;

public class Main {
    public static void main(String[] args) {

        Student NN = new Student();

        System.out.println(Student.ispiti);

        Student.ispiti = 15;
        System.out.println(NN.ispiti);
    }
}
