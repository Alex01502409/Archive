package struktogramm;

import java.util.Locale;
import java.util.Scanner;

public class MinMaxMittel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO: Schritt 1
        System.out.println("Bestimmung von Min., Max. und Mittelwert einer Zahlenreihe");

        // TODO: Schritt 2
        int n;
        do {
            System.out.print("Anzahl der Werte (>0): ");
            n = scan.nextInt();
        } while (n < 1);

        // TODO: Schritt 3
        double mittel = 0.0;

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        // TODO: Schritt 4
        int wert;
        for (int i = 1; i <= n; i++) {
            // TODO: Schritt 5
            System.out.print(i + ". Wert: ");
            wert = scan.nextInt();

            // TODO: Schritt 6
            mittel += wert;


            // TODO: Schritt 7
            if (i == 1 || wert > max) {
                max = wert;
            }

            // TODO: Schritt 8
            if (i == 1 || wert < min) {
                min = wert;
            }

        }

        // TODO: Schritt 9
        mittel = mittel / n;

        // TODO: Schritt 10
        System.out.printf(Locale.GERMANY, "\nMin. = %,d\nMax. = %,d\nMittel = %,.2f\n", min, max, mittel);
    }
}
