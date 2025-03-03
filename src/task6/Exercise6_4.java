package task6;

import java.util.Arrays;

public class Exercise6_4 {
    //Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив. Выполнить с помощью цикла for
    public static void main(String[] args) {
        int[] array = {9, 4, 6, 2, 8};

        Arrays.sort(array);

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

