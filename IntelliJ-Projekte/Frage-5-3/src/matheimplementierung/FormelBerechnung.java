package matheimplementierung;

public class FormelBerechnung {

    // Methode zur Berechnung der Formel
    public void bestimme(long x) {
        // Überprüfen, ob der Wertebereich gültig ist
        if (x <= 0) {
            System.out.println("Ungültiger Wert für x. x muss eine positive Ganzzahl sein.");
            return;
        }

        try {
            // Berechnung von x!
            long factorial = berechneFakultaet(x);

            // Berechnung der inneren Wurzel
            double innererWert = Math.sqrt(x - (1.0 / x));

            // Berechnung des Nenners (cos(x))
            double cosX = Math.cos(x);

            // Überprüfung, ob der Nenner null ist
            if (cosX == 0) {
                System.out.println("Berechnung nicht möglich, da cos(x) = 0.");
                return;
            }

            // Endgültige Berechnung der Formel
            double ergebnis = (x * innererWert / cosX) * factorial;

            // Ausgabe des Ergebnisses
            System.out.println("Das Ergebnis der Formel für x = " + x + " ist: " + ergebnis);
        } catch (Exception e) {
            System.out.println("Fehler bei der Berechnung: " + e.getMessage());
        }
    }

    // Hilfsmethode zur Berechnung von x!
    private long berechneFakultaet(long x) throws ArithmeticException {
        long ergebnis = 1;
        for (long i = 1; i <= x; i++) {
            ergebnis = Math.multiplyExact(ergebnis, i); // Sichere Multiplikation mit Überprüfung auf Überlauf
        }
        return ergebnis;
    }

}
