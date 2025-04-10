package praktikumhsmw2;

public class RechteckTester {
    public static void main(String[] args) {
        Punkt p = new Punkt(2,2);
        Rechteck r1 = new Rechteck(p, 4, 8);
        Rechteck r2 = new Rechteck(1, 1, 6, 9);

        r1.verschieben(4,4);
        r2.versetzen(5,5);

        System.out.println(r1.toString() + "\n" + r2.toString());

        if (r1.equals(r2)) {
            System.out.println("\nRechteck 1 und Rechteck 2 sind gleich");
        } else {
            System.out.println("\nRechteck 1 und Rechteck 2 sind unterschiedlich");
        }
    }
}
