package kontrollstrukturen;

public class Schleifen {
    public static void main(String[] args) {
        System.out.println("Ergebnis von 1. Schleife ist: ");
        Schleife01();

        System.out.println("Ergebnis von 2. Schleife ist: ");
        Schleife02();

        System.out.println("Ergebnis von 3. Schleife ist: ");
        Schleife03();

        System.out.println("Ergebnis von 4. Schleife ist: ");
        Schleife04();

        System.out.println("Ergebnis von 5. Schleife ist: ");
        Schleife05();

        System.out.println("Ergebnis von 6. Schleife ist: ");
        Schleife06();

        /* Programmiere eine Schleife, die die Ganzzahlen
            von 1 bis 10 (alle auf einer Zeile, durch je ein
            Leerzeichen voneinander getrennt) auf der Konsole ausgibt. */
        System.out.println("Ergebnis von 7. Schleife ist: ");
        Schleife07();

        /* Programmiere eine Schleife, die alle durch 3 teilbaren
        Ganzzahlen zwischen 10 und 40 zur ausgibt. */
        System.out.println("Ergebnis von 8. Schleife ist: ");
        Schleife08();

        System.out.println("Ergebnis von 9. Schleife ist: ");
        Schleife09();

        System.out.println("Ergebnis von 10. Schleife ist: ");
        Schleife10();

        System.out.println("Ergebnis von 11. Schleife ist: ");
        Schleife11();

        System.out.println("Ergebnis von 12. Schleife ist: ");
        Schleife12();

    }

    public static void Schleife01() {
        int a = 7;
        while (a > 0) {
            System.out.print(a + " ");
            a/=2;
        }
        System.out.println();
    }

    public static void Schleife02() {
        int b = 7;
        do {
            b/=2;
            System.out.print(b + " ");
        } while (b > 0);
        System.out.println();
    }

    public static void Schleife03() {
        for (int c = -3; c < 5; c += 2) {
            System.out.print(2 * c + 4 + " ");
        }
        System.out.println();
    }

    public static void Schleife04() {
        for (int d = 3; 2 * d > -3; d--) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void Schleife05() {
        int e = 3;
        for (int i1 = 1; i1 <= e; i1++) {
            for (int i2 = 1; i2 <= 2 * e; i2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Schleife06() {
        int f = 5;
        for (int i1 = 1; i1 <= f; i1++) {
            for (int i2 = 1; i2 <= i1; i2++) {
                System.out.print("++");
            }
            System.out.println();
        }
    }

    public static void Schleife07() {
        for (int x = 1; x < 11; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void Schleife08() {
        for (int x = 10; x <= 40; x++) {
            if (x % 3 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public static void Schleife09() {
        for (int y = -5; y  <= 19; y += 3) {
            System.out.print(y + " ");
        }
        System.out.println();
    }

    public static void Schleife10() {
        int w = 1;
        do {
            System.out.print(w + " ");
            w*=2;
        } while (w <= 4096);
        System.out.println();
    }

    public static void Schleife11() {
        int w = 1;
        do {
            System.out.print((w + 2) + " ");
            w*=2;
        } while (w <= 4098);
        System.out.println();
    }

    public static void Schleife12() {
        int zahl = 1;
        int dif = 1;

        for (int i = 0; zahl <= 92; i++) {
            System.out.print(zahl + " ");
                zahl += dif;
                dif++;
        }

    }
}

