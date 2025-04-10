package mathematikfrominsta;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть число від 1 до 6: ");
        int UserNummber = scan.nextInt();

        if (UserNummber < 1 || UserNummber > 6) {
            System.out.println("Число НЕ в діапозоні!");
            System.exit(0);
        }

        int[] rolls = new int[3];
        boolean isWin = false;

        System.out.println("Кидаємо кубики...");
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = random.nextInt(6) + 1;
            System.out.println("Кубик " + (i + 1) + " випав на числі: " + rolls[i]);
            if (rolls[i] == UserNummber) {
                isWin = true;
            }
        }

        if (isWin){
            System.out.println("\nВітаємо з ПЕРЕМОГОЮ!");
        } else {
            System.out.println("\nНажаль ви програли((");
        }




    }

}
