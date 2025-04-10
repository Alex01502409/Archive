package matheimplementierung;

public class FormelTester {
    public static void main(String[] args) {
        FormelBerechnung berechnung = new FormelBerechnung();

        // Verschiedene Testwerte für x
        long[] testwerte = {1, 2, 5, 10, 20, -1, 0};

        for (long x : testwerte) {
            System.out.println("\nBerechnung für x = " + x + ":");
            berechnung.bestimme(x);
        }
    }
}
