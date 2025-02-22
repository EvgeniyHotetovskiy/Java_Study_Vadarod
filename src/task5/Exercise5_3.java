package task5;

import java.util.Scanner;

public class Exercise5_3 {
    // Ввести число с консоли, которое не заканчивается на 0.
    //Вывести число в обратном порядке. Использовать оператор %. (цикл while, на подобии задачи, которую разбирали в конце занятия)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getPositiveNumber(scanner);
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        System.out.println(reverse);
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