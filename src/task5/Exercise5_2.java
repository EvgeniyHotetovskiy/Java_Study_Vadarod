package task5;

import java.util.Scanner;

public class Exercise5_2 {
    //Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого. (Используйте цикл
    //while). Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getPositiveNumber(scanner, "Введите первое положительное число: ");
        int num2 = getPositiveNumber(scanner, "Введите второе положительное число: ");
        // Проверка, что num1 меньше или равно num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int sum = 0;
        int current = num1;
        while (current <= num2) {
            sum += current;
            current++;
        }
        System.out.println("Сумма всех чисел от " + num1 + " до " + num2 + " равна: " + sum);
        scanner.close();
    }

    private static int getPositiveNumber(Scanner scanner, String prompt) {
        int number;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введено не число. Попробуйте снова.");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Ошибка: число должно быть положительным. Попробуйте снова.");
            }
        } while (number <= 0);
        return number;
    }
}