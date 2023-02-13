package vezbanje_facebook;

public class Main {
    public static void main(String[] args) {
        Reakcije r1 = new Reakcije("smajli", "Marko PP");
        Reakcije r2 = new Reakcije("lajk", "mm mm");
        Reakcije r3 = new Reakcije("dislajk", "mmkkll");



        FacebookPost post1 = new FacebookPost("Marko ll", "kako ste");
        post1.reaguj(r1);
        post1.reaguj(r2);
        post1.reaguj(r3);
        post1.stampa();






    }
}
