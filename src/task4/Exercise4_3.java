package task4;

import java.util.Scanner;

public class Exercise4_3 {
//Дано 15/x=result, где x-число, которое вводится с
//командной строки, result-результат вычисления. Написать программу, которая будет выводить разный текст, в зависимости от значения result. В случае
//result=3, вывести: "Результат деления равен 3" В случае result=5вывести: "Результат деления равен 5" В других случаях вывести:
//"Результат деления равен дробному числу". При этом в последнем случае вывести точный результат деления (использовать приведение типов) Для выполнения
//задания использовать оператор switch- case.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    double x = scanner.nextDouble();
    double result = 15 / x;
    int intResult = (int) result;
    switch (intResult) {
        case 3:
            System.out.println("Результат деления равен 3");
            break;
        case 5:
            System.out.println("Результат деления равен 5");
            break;
        default:
            System.out.println("Результат деления равен дробному числу: " + result);
            break;
    }
    scanner.close();
}
}
