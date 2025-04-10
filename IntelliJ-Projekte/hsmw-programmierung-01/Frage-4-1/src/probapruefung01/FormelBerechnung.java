package probapruefung01;


public class FormelBerechnung {

    // Konstante für g
    private static final double G = 9.81;

    public static void main(String[] args) {
        double v, x, alpha;

        if (args.length < 3) {
            System.out.println("Keine Kommandozeilenparameter angegeben. Standardwerte werden verwendet: v= 10, x= 5, alpha= 45 Grad.");
            // Beispielwerte
            v = 10; // Geschwindigkeit
            x = 5;  // Wert x
            alpha = Math.toRadians(45); // Winkel alpha in Grad, konvertiert zu Bogenmaß
        } else {
            // Einlesen der Kommandozeilenparameter
            v = Double.parseDouble(args[0]);
            x = Double.parseDouble(args[1]);
            alpha = Math.toRadians(Double.parseDouble(args[2])); // Konvertierung zu Bogenmaß
        }

        // Überprüfung der Wertebereiche
        if (v <= 0) {
            System.out.println("Die Geschwindigkeit v muss größer als 0 sein.");
            return;
        }

        // Berechnung des Ergebnisses mit der Methode
        double ergebnis = bestimmeWert(v, x, alpha);
        System.out.printf("Das Ergebnis der Berechnung ist: %.4f%n", ergebnis);

    }

    private static double bestimmeWert(double v, double x, double alpha) {
        // Berechnung der Formel
        double term1 = x * Math.tan(alpha);
        double term2 = (G / (2 * Math.pow(v, 2) * Math.pow(Math.cos(alpha), 2))) * Math.pow(x, 2);

        return term1 - term2;
    }
}