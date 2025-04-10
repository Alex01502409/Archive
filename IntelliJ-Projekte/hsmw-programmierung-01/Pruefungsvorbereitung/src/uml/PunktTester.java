package uml;

 class PunktTester {
    public static void main(String[] args) {

        Punkt p1 = new Punkt(5, 7);
        Punkt p2 = new Punkt();
        System.out.println("Punkt 01: " + p1.toString());
        System.out.println("Punkt 02: " + p2.toString());

        System.out.println("\nJetzt  Punkt-02 wird versetzt...");
        p2.versetzen(3,3);
        System.out.println("Hier ist neu Punkt02: " + p2.toString());

        System.out.println("\nUnd jetzt verschieben wir Punkt-02 auf 2 und 4...");
        p2.verschieben(2,4);
        System.out.println("Hier ist unsere ergebnis: " + p2.toString());

        if (p1.equals(p2)) {
            System.out.println("\nPunkt 1 und Punkt 2 sind gleich");
        } else {
            System.out.println("\nPunkt 1 und Punkt 2 sind unterschiedlich");
        }

    }
}
