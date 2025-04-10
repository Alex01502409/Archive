package test;

public class FormelBerechnung {

    public static void berechne(double x, double m, double a, double b) {

        if (a == b) {
            System.out.println("Division durch Null in der Formel! Berechnung nicht möglich.");
            return;
        }

        double ersterTeil = Math.pow(x, m) * Math.cbrt(a - b); // Kubikwurzel von (a - b)

        double summenErgebnis = 0;
        for (int n = 0; n <= 25; n++) {
            double divisor = n * a - b;
            if (divisor == 0) {
                System.out.println("Division durch 0 bei n = " + n + ". Summen-Term übersprungen.");
                continue;
            }
            summenErgebnis += (n + 1) / divisor;
        }

        double ergebnis = ersterTeil + summenErgebnis;

        System.out.println("Das Ergebnis der Berechnung ist: " + ergebnis);
    }
}
