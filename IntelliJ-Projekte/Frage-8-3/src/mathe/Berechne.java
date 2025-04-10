package mathe;

import java.util.Locale;

public class Berechne {
    // TODO: Schritt 1
    public static void berechne(float altZahl, float neuZahl) {

        // TODO: Schritt 2
        float vebrauch = neuZahl - altZahl;

        // TODO: Schritt 3
        float preis;
        if (vebrauch > 50) {
            preis = 0.45f;
        } else {
            preis = 0.35f;
        }

        // TODO: Schritt 4
        float rechnungsbetrag = vebrauch * preis;

        // TODO: Schritt 5
        float mwst = rechnungsbetrag * 0.19f;

        // TODO: Schritt 6
        float gesamt = rechnungsbetrag + mwst;

        // TODO: Schritt 7
        System.out.printf(Locale.GERMANY,"Rechnungsbetrag: %,.2f", rechnungsbetrag);
        System.out.printf(Locale.GERMANY, "\nMehrwertsteuer: %,.2f", mwst);
        System.out.printf(Locale.GERMANY,"\nGesamtbetrag: %,.2f", gesamt);

    }

    public static void main(String[] args) {
        berechne(100, 160);
    }

}
