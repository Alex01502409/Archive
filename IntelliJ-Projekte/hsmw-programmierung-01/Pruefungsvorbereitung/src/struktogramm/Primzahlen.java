package struktogramm;

import java.util.Scanner;

public class Primzahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вивід заголовка
        System.out.println("Bestimmung der ersten n Primzahlen");

        int n;

        // Використання do-while для перевірки введеного значення
        do {
            System.out.print("Anzahl der Primzahlen (>0): ");
            n = scanner.nextInt();
        } while (n < 1);

        // Вивід першого простого числа "2" із відступом у 7 пробілів
        System.out.print("       2 "); // 7 пробілів перед числом 2

        int p = 3; // Початкове значення для перевірки простих чисел

        while (n > 1) {
            int t = 3; // Початковий дільник для перевірки простоти

            // Перевіряємо всі можливі дільники до √p
            while (t * t <= p && p % t != 0) {
                t += 2; // Перевіряємо лише непарні дільники
            }

            // Якщо t * t перевищує p, то число є простим
            if (t * t > p) {
                System.out.print(p + " ");
                n--; // Зменшуємо лічильник простих чисел
            }

            p += 2; // Переходимо до наступного непарного числа
        }

        scanner.close();
    }
}
