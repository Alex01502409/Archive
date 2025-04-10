package rational;

import java.util.Locale;

public class RationalTester {
    public static void main(String[] args) {

        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,2);

        System.out.println("1. mathematischer Bruch: " + r1.toString());
        String doubleValueFormated = String.format(Locale.GERMANY, "%,.2f", r1.doubleValue());
        System.out.println("Bruchzahl im numerischen Format: " + doubleValueFormated);

        System.out.println("\n2. mathematischer Bruch: " + r2.toString());
        String doubleValue2Formated = String.format(Locale.GERMANY, "%,.2f", r2.doubleValue());
        System.out.println("Bruchzahl im numerischen Format: " + doubleValue2Formated);

        System.out.println("\nPrüfen wir zunächst, ob sie identisch sind: ");

        if (r1.equals(r2)) {
            System.out.println("Diese beiden Brüche sind gleich!");
        } else {
            System.out.println("Diese beiden Brüche sind unterschiedlich :(");
        }




        System.out.println("\nAdditionsergebnis: " + r1.plus(r2));
        System.out.println("Subtraktionsergebnis: " + r1.minus(r2));
        System.out.println("Multiplikationsergebnis: " + r1.mal(r2));
        System.out.println("Divisionsergebnis: " + r1.durch(r2));







    }
}
