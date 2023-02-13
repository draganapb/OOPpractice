package OOP22;

public class Main {
    public static void main(String[] args) {
//    Potrebna je i Main klasa za kreiranje objekata i izvrsavanje komandi
        VideoPlayer video1 = new VideoPlayer(126, 50, 52, 200);
        video1.stampa();

        TimeControl control1 = new TimeControl(false);
        control1.izvrsiAkciju(video1);

    }
}
