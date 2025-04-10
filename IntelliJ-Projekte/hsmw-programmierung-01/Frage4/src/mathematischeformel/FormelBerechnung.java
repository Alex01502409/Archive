package mathematischeformel;

public class FormelBerechnung {
    public static void main(String[] args) {
        // Beispielhafte Aufrufe der Funktion
        System.out.println("f(0) = " + bestimmeWert(0));
        System.out.println("f(0.5) = " + bestimmeWert(0.5));
        System.out.println("f(1) = " + bestimmeWert(1));
        System.out.println("f(2) = " + bestimmeWert(2));
        System.out.println("f(5) = " + bestimmeWert(5));
    }

    public static double bestimmeWert(double x) {
        if (x == 0) {
            return 1; // Spezielle Behandlung für x = 0
        } else if (x < 1) {
            return 1 / x; // Formel für x < 1
        } else if (x == 1) {
            return 1; // Zusätzliche Bedingung für x = 1
        } else { // x > 1
            // rekursive Berechnung
            return bestimmeWert(x - 1) * ((1 - x) / Math.sqrt(x) - Math.sqrt(x) / 2);
        }
    }
}
