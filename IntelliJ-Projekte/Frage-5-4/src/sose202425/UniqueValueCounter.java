package sose202425;

public class UniqueValueCounter {
    public static void erkennen(int[][] array) {
        int[] frequency = new int[101]; // Annahme: Werte liegen zwischen 0 und 100

        // Zähle die Häufigkeit jedes Wertes im Array
        for (int[] row : array) {
            for (int num : row) {
                frequency[num]++;
            }
        }

        // Zähle die eindeutigen Werte (Häufigkeit == 1)
        int uniqueCount = 0;
        for (int count : frequency) {
            if (count == 1) {
                uniqueCount++;
            }
        }

        // Ausgabe der Anzahl der eindeutigen Werte
        System.out.println("Anzahl der gefundenen nicht doppelten Werte: " + uniqueCount);
    }

    public static void main(String[] args) {
        int[][] beispielArray = {
                {2, 2},
                {3, 4},
                {5, 3}
        };
        erkennen(beispielArray);
    }
}
