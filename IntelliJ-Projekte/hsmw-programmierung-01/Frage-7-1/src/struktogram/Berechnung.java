package struktogram;

public class Berechnung {

    public static void berechne(long a, long b, long c) {
        // Schritt 1: Überprüfen, ob a < 0
        if (a < 0) {
            a = -a; // Wenn ja, a in den positiven Bereich bringen
        }

        // Schritt 2: Initialisierung einer zusätzlichen Variablen, falls benötigt
        long m = 0; // Variable m wird initialisiert, aber nicht weiter verwendet (laut Diagramm)

        // Schritt 3: Überprüfen, ob b < c
        if (b < c) {
            // Tausche b und c
            long temp = b;
            b = c;
            c = temp;
        } else {
            // Wenn b >= c, dann b halbieren
            b = b / 2;
        }

        // Schritt 4: c modifizieren
        c = c % 10;

        // Ausgabe der Ergebnisse
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }

    public static void main(String[] args) {
        // Beispielaufruf der Methode
        berechne(-15, 30, 25);

    }
}
