package testpackage;


import java.util.Random;

public class MuenzenWurf {

    public static void main(String[] args) {
        // Überprüfung, ob die Anzahl der Würfe als Parameter übergeben wurde
        if (args.length < 1) {
            System.out.println("Bitte geben Sie die Anzahl der Würfe als Parameter an.");
            return;
        }

        // Anzahl der Würfe aus dem Kommandozeilenparameter holen
        int anzahlWuerfe = Integer.parseInt(args[0]);


        // Überprüfung auf gültige Werte
        if (anzahlWuerfe <= 0) {
            System.out.println("Die Anzahl der Würfe muss größer als 0 sein.");
            return;
        }

        // Array zur Speicherung der Würfe
        String[] ergebnisse = new String[anzahlWuerfe];

        // Würfel-Methode aufrufen
        werfeMuenze(ergebnisse);

        // Ergebnisse ausgeben
        gibErgebnisseAus(ergebnisse);
    }

    // Methode, die die Würfe simuliert
    private static void werfeMuenze(String[] ergebnisse) {
        Random random = new Random();

        for (int i = 0; i < ergebnisse.length; i++) {
            // Zufälliges Ergebnis generieren
            boolean istWappen = random.nextBoolean();
            ergebnisse[i] = istWappen ? "Wappen" : "Zahl";
        }
    }

    // Methode, die die Ergebnisse auf der Konsole ausgibt
    private static void gibErgebnisseAus(String[] ergebnisse) {
        for (int i = 0; i < ergebnisse.length; i++) {
            System.out.println("Wurf " + (i + 1) + ": " + ergebnisse[i]);
        }
    }
}