package praktikumhsmw2;

public class Main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(5,7);
        Punkt p2 = new Punkt();


        // Informationen zum ersten Punkt
        System.out.println("Punkt 1 erzeugt");
        System.out.println("X = " + p1.getX());
        System.out.println("Y = " + p1.getY());


        // Informationen zum zweiten Punkt
        p2.versetzen(3,3);
        p2.verschieben(2,4);
        System.out.println("\n2. Punkt: " + p2.toString());


        // Punktvergleich
        System.out.println("\nPunktvergleich:");
        if (p1.equals(p2)) {
            System.out.println("p1 & p2 haben gleiche Koordinaten");
        } else {
            System.out.println("p1 & p2 haben verschiedene Koordinaten");
        }




        /** Zusatzaufgaben */

        // Erstellen eines dritten Punktes mit über die Tastatur eingegebenen Koordinaten
        System.out.println("\nGeben Sie die Koordinaten für den dritten Punkt ein:");

        System.out.print("X-Koordinate eingeben: ");
        double x = Keyboard.readDouble();

        System.out.print("Y-Koordinate eingeben: ");
        double y = Keyboard.readDouble();
        Punkt p3 = new Punkt(x, y);

        System.out.println("3. Punkt: " + p3.toString()); // Ausgabe von Informationen zum dritten Punkt

        p1.versetzen(p3.getX(), p3.getY()); // Ändern der Koordinaten des 1. Punktes in die Koordinaten des 3. Punktes

        // Überzeugen Sie sich davon, dass beide Objekte nun den gleichen Punkt der Ebene darstellen.
        if (p1.equals(p3)) {
            System.out.println("\nDer erste und dritte Punkt haben die gleichen Koordinaten");
        } else {
            System.out.println("\nDer erste und dritte Punkt haben unterschiedliche Koordinaten.");
        }

    }

}
