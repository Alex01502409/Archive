package rollingdies;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DiceImpl dice = new DiceImpl();

        System.out.println("Введіть число від 1 до 6:");
        int UserNumber = scanner.nextInt();

        if (UserNumber < 1 || UserNumber > 6) {
            System.out.println("Число має бути в діапозоні від 1 до 6!");
            return;
        }

        int[] rolls = new int[3];
        boolean isWin = false;

        System.out.println("Кидаємо кубики...");
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = dice.roll();
            System.out.println("Кубик " + (i + 1) + " випав на число: " + rolls[i]);
            if (rolls[i] == UserNumber) {
                isWin = true;
            }
        }

        if (isWin) {
            System.out.println("\nВітаємо! Ви перемогли!");
        } else {
            System.out.println("\nНа жаль, ви програли. Спробуйте ще раз!");
        }

    }
}
