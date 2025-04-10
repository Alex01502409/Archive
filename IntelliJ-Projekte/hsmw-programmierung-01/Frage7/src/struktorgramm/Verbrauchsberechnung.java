package struktorgramm;

public class Verbrauchsberechnung {
    public void berechne(float zaehlerAlt, float zaehlerNeu) {
        // Verbrauch berechnen
        float verbrauch = zaehlerNeu - zaehlerAlt;

        // Preis pro Einheit basierend auf Verbrauch festlegen
//        float preis = (verbrauch > 50) ? 0.45f : 0.35f;
        float preis;
        if (verbrauch > 50) {
            preis = 0.45f;
        } else {
            preis = 0.35f;
        }

        // Rechnungsbetrag berechnen
        float rechnungsbetrag = verbrauch * preis;

        // Mehrwertsteuer berechnen (19%)
        float mwst = rechnungsbetrag * 0.19f;

        // Gesamtbetrag berechnen
        float gesamtbetrag = rechnungsbetrag + mwst;

        // Ausgabe der Ergebnisse
        System.out.printf("Rechnungsbetrag: %.2f%n", rechnungsbetrag);
        System.out.printf("Mehrwertsteuer: %.2f%n", mwst);
        System.out.printf("Gesamtbetrag: %.2f%n", gesamtbetrag);
    }

    public static void main(String[] args) {
        // Beispielaufruf der Methode mit Beispielwerten
        Verbrauchsberechnung vb = new Verbrauchsberechnung();
        vb.berechne(100.0f, 160.0f);
    }
}
