package task6;

public class Exercise6_2 {
    //Создать массив из 5 чисел и заполните этот массив вручную. Создайте второй массив с размерностью больше на 1 чем первый массив.
    // Необходимо скопировать первый массив со всеми значениями во второй массив. Последний элемент во втором массиве пусть будет 0.
    // Выведите второй массив в консоль с помощью цикла for each.
        public static void main(String[] args) {
            int[] firstArray = {1, 2, 3, 4, 5};

            int[] secondArray = new int[firstArray.length + 1];

            for (int i = 0; i < firstArray.length; i++) {
                secondArray[i] = firstArray[i];
            }

            System.out.println("Второй массив:");
            for (int num : secondArray) {
                System.out.print(num + " ");
            }
        }
        }

