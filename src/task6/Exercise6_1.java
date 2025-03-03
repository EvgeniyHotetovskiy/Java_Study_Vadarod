package task6;

public class Exercise6_1 {
    //Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль(выводите через цикл for each).
    //Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each.
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.println("Измененный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

