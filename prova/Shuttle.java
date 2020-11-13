package prova;

public class Shuttle extends Rocket {
    public static void main(String[] args) {
        new Shuttle().go();
    }
    void go() {
        blastOff();
        // Rocket.blastOff(); // linha A
    }
    private void blastOff() { System.out.print("sh-bang "); }
}
