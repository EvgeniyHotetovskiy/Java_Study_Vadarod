package task5;

import java.util.Scanner;

public class Exercise5_4 {
    //Ввести число с консоли, которое не заканчивается на 0.
    //Вывести чётные и нечётные числа через while and if. Использовать оператор %
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getPositiveNumber(scanner);
        System.out.println("Чётные цифры:");
        printDigits(number, true);
        System.out.println("\nНечётные цифры:");
        printDigits(number, false);
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
    private static void printDigits(int number, boolean isEven) {
        String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            if ((isEven && digit % 2 == 0) || (!isEven && digit % 2 != 0)) {
                System.out.print(digit + " ");
            }
        }
    }
}