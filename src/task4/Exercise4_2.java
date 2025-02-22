package task4;

import java.util.Scanner;

public class Exercise4_2 {
    //На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Введите число");
        int b = scanner.nextInt();
        System.out.println("Введите число");
        int c = scanner.nextInt();
        System.out.print("Числа из введенных, которые делятся на 2 и на 5: ");
        if (a % 2 == 0 && a % 5 == 0) {
            System.out.print(a + " ");
        }
        if (b % 2 == 0 && b % 5 == 0) {
            System.out.print(b + " ");
        }
        if (c % 2 == 0 && c % 5 == 0) {
            System.out.print(c);
        }
        scanner.close();
    }
}
