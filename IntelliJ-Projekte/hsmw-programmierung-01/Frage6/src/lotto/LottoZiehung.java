package lotto;

import java.util.Random;

public class LottoZiehung {
    public static void main(String[] args) {

        int[] lottoZahlen = new int[7];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int zahl;
            boolean bereitsGezogen;
            do {
                zahl = random.nextInt(49) + 1;
                bereitsGezogen = istZahlVorhanden(lottoZahlen, zahl);
            } while (bereitsGezogen);

            lottoZahlen[i] = zahl;
        }

        lottoZahlen[6] = random.nextInt(9) + 1;

        System.out.print("Gezogene Lottozahlen: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lottoZahlen[i] + " ");
        }
        System.out.println("\nZusatzzahl: " + lottoZahlen[6]);
    }

    private static boolean istZahlVorhanden(int[] array, int zahl) {

        for (int value : array) {
            if (value == zahl) {
                return true;
            }
        }
        return false;

    }
}