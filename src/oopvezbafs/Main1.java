package oopvezbafs;

public class Main1 {
    public static void main(String[] args) {

        Emotikon em1 = new Emotikon("lajk", "marko");
        Emotikon em2 = new Emotikon("lajk", "zeljka");
        Emotikon em3 = new Emotikon("srce", "zzzz");


        FejsPost post1 = new FejsPost("zeljko", "cao drugari");
        post1.dajEmotikon(em1);
        post1.dajEmotikon(em2);
        post1.dajEmotikon(em3);
        post1.brojanje("lajk");
        post1.brojanje("srce");
        post1.stampa();

    }
}

