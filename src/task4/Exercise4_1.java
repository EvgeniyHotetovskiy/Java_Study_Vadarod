package task4;

import java.util.Scanner;

public class Exercise4_1 {
    //На вход даны 3 числа. Вывести в консоль только четные числа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        System.out.print("Четные числа из введенных:");
        if (a % 2 == 0) {
            System.out.print(a + " ");
        }
        if (b % 2 == 0) {
            System.out.print(b + " ");
        }
        if (c % 2 == 0) {
            System.out.print(c);
        }
        scanner.close();
    }
}

