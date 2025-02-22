package task5;

import java.util.Scanner;

public class Exercise5_4 {
    //Ввести число с консоли, которое не заканчивается на 0.
    //Вывести чётные и нечётные числа через while and if. Использовать оператор %
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getPositiveNumber(scanner);
        int current = 1;
        System.out.println("Чётные числа:");
        while (current <= number) {
            if (current % 2 == 0) {
                System.out.print(current + " ");
            }
            current++;
        }
        System.out.println("\nНечётные числа:");
        current = 1; // Сброс значения current
        while (current <= number) {
            if (current % 2 != 0) {
                System.out.print(current + " ");
            }
            current++;
        }
        scanner.close();
    }

    private static int getPositiveNumber(Scanner scanner) {
        int number;
        do {
            System.out.print("Введите положительное число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введено не число. Попробуйте снова.");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Ошибка: число должно быть положительным. Попробуйте снова.");
            }
            if (number % 10 == 0) {
                System.out.println("Ошибка: введенное число заканчивается на 0. Попробуйте снова.");
            }
        } while (number <= 0 || number % 10 == 0);
        return number;
    }
}