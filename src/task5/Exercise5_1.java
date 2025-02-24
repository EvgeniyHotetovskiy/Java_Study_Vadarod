package task5;

public class Exercise5_1 {
    // Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)
    public static void main(String[] args) {
        int a = 1;
        while (a <= 100) {
            if (a % 7 == 0 || a % 3 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
