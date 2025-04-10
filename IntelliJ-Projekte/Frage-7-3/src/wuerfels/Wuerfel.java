package wuerfels;

import java.util.Random;

public class Wuerfel {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Bitte geben Sie die Anzahl der Würfe als Parameter an.");
            return;
        }

        int anzahlWuerfe;

        try {
            anzahlWuerfe = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Bitte geben Sie eine gültige Ganzzahl als Anzahl der Würfe an.");
            return;
        }

        if (anzahlWuerfe <= 0) {
            System.out.println("Die Anzahl der Würfe muss größer als 0 sein.");
            return;
        }

        int[] ergebniss = new int[anzahlWuerfe];

        simuliereWuerfe(ergebniss);
        gibErgebnisseAus(ergebniss);

    }

    private static void simuliereWuerfe(int[] ergebniss) {
        Random random = new Random();
        int zahl;

        for (int i = 0; i < ergebniss.length; i++) {
            zahl = random.nextInt(6) + 1;
            ergebniss[i] = zahl;
        }

    }

    private static void gibErgebnisseAus(int[] ergebniss) {

        for (int i = 0; i < ergebniss.length; i++) {

            if ((i+1) < 10){
                System.out.println("Wurf 0" + (i + 1) + ": " + ergebniss[i]);
            }else {
                System.out.println("Wurf " + (i + 1) + ": " + ergebniss[i]);
            }

        }

    }
}
