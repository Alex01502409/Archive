package test;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.ausgabe(1, 12, 23, 34));
    }

    public int ausgabe(int... n) {
        double wert = 0;
        for (int b : n){
            wert = wert + ((double) b /10);
        }
        return (int) wert;

    }
}
