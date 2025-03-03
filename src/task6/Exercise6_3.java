package task6;

public class Exercise6_3 {
    //Создать массив вручную. Заменить максимальный
    //и минимальный элемент массива. Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
        public static void main(String[] args) {
            int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5};

            int maxIndex = 0;
            int minIndex = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            array[maxIndex] = 1000;
            array[minIndex] = -1000;

            System.out.println("Измененный массив:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
}
