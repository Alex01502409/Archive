package klassendiagramm;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class Ball {
    // Attribute
    private double radius;
    private double mx, my, mz;
    private static final double PI = 3.14159;

    // Standard-Konstruktor
    public Ball() {
        this.radius = 1.0;
        this.mx = 1.0;
        this.my = 1.0;
        this.mz = 1.0;
    }

    // Konstruktor mit Parametern
    public Ball(double radius, double mx, double my, double mz) {
        this.radius = radius;
        this.mx = mx;
        this.my = my;
        this.mz = mz;
    }

    // Zugriffsmethoden
    public double getRadius() {
        return radius;
    }

    public double getX() {
        return mx;
    }

    public double getY() {
        return my;
    }

    public double getZ() {
        return mz;
    }

    // Equals-Methode
    public boolean equals(Ball o) {
        boolean ergebnis =
                this.radius == o.getRadius() &&
                        this.mx == o.getX() &&
                        this.my == o.getY() &&
                        this.mz == o.getZ();
        return ergebnis;
    }

    // toString-Methode
    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", mx=" + mx +
                ", my=" + my +
                ", mz=" + mz +
                '}';
    }

    // Methode zur Berechnung des Volumens
    public double berechneVolumen() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    // Methode zur Berechnung der Oberfläche
    public double berechneFlaeche() {
        return 4.0 * PI * Math.pow(radius, 2);
    }

    // Vergleichsmethode
    public static boolean vergleiche(Ball r1, Ball r2) {
        return r1.equals(r2);
    }

    // Main-Methode
    public static void main(String[] args) {
        ArrayList<Double> volumenListe = new ArrayList<>();
        ArrayList<Double> flaechenListe = new ArrayList<>();
        ArrayList<Ball> balls = new ArrayList<>();
        Random random = new Random();

        double gesamtVolumen = 0.0;

        // 500 Bälle erzeugen
        for (int i = 0; i < 500; i++) {
            double radius = 1.0 + random.nextDouble() * 10.0; // Radius zwischen 1 und 11
            double mx = random.nextDouble() * 100.0;
            double my = random.nextDouble() * 100.0;
            double mz = random.nextDouble() * 100.0;

            Ball ball = new Ball(radius, mx, my, mz);
            balls.add(ball);
            double volumen = ball.berechneVolumen();
            double flaeche = ball.berechneFlaeche();

            volumenListe.add(volumen);
            flaechenListe.add(flaeche);

            gesamtVolumen += volumen;
        }

        // Ergebnisse ausgeben
        String gesamtVolumenFormatted = String.format(Locale.GERMANY, "%,.3f", gesamtVolumen);
        System.out.println("Gesamtvolumen: " + gesamtVolumenFormatted);

        // Ergebnisse ausgeben
        for (int i = 0; i < volumenListe.size(); i++) {
            String volumenFormatted = String.format(Locale.GERMAN, "%,.2f", volumenListe.get(i));

            double prozentAnteil = (volumenListe.get(i) / gesamtVolumen) * 100.0;
            String prozentAnteilFormatted = String.format(Locale.GERMANY, "%,.2f", prozentAnteil);

            System.out.println("Ball " + (i + 1) + ": Volumen = " + volumenFormatted +
                    ", Prozentualer Anteil = " + prozentAnteilFormatted + "%");
        }

        Ball ball1 = balls.get(0);
        Ball ball2 = balls.get(1);
//        Ball ball1 = new Ball(5, 2, 2, 2);
//        Ball ball2 = new Ball(5,2,2,2);

        if (ball1.equals(ball2)) {
            System.out.println("\nThe balls are the same! Cool!");
            System.out.printf(Locale.GERMANY, "Date from both balls is hier:\nx: %.2f \ny: %.2f \nz: %.2f \nradius: %.2f", ball1.getX(), ball1.getY(), ball1.getZ(), ball1.getRadius());
        } else {
            System.out.println("\nSorry, not the same:(");
            System.out.printf(Locale.GERMANY, "Date from Ball 01:\nx: %.2f \ny: %.2f \nz: %.2f \nradius: %.2f", ball1.getX(), ball1.getY(), ball1.getZ(), ball1.getRadius());
            System.out.printf(Locale.GERMANY, "\n\nDate from Ball 02:\nx: %.2f \ny: %.2f \nz: %.2f \nradius: %.2f", ball2.getX(), ball2.getY(), ball2.getZ(), ball2.getRadius());
        }

    }
}