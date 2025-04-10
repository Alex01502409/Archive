package rechenaufgaben01;

import java.util.ArrayList;

public class Rechenaufgabe {
    public static void main(String[] args) {
        ArrayList<Double> ergebnis = new ArrayList<>();

        double x1 = 1 + 7 - 9 + 43;
        ergebnis.add(x1);
        double x2 = 43 - 9 + 7 + 1;
        ergebnis.add(x2);
        double x3 = 4 * 3 + 1;
        ergebnis.add(x3);
        double x4 = 9 * (2 + 1);
        ergebnis.add(x4);
        double x5 = (double) (4 * 3) / 6;
        ergebnis.add(x5);
        double x6 = (3 - 7) * (7 + 4);
        ergebnis.add(x6);
        double x7 = (double) 3 /4;
        ergebnis.add(x7);



        print(ergebnis);

    }

    protected static void print(ArrayList<Double> ergebnis){
        for (int i = 0; i < ergebnis.size(); i++) {
            System.out.println("Ergebnis from " + (i+1) + " ist: " + ergebnis.get(i));
        }
    }

}
