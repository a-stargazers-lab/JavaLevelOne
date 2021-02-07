import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {
        System.out.println("Task One -------------------------------");
        int[] num = {0, 1, 1, 0, 1, 0, 0, 1, 1};
        System.out.println("Changed from " + Arrays.toString(num) + " to");
        replace(num);
        System.out.println("Task Two -------------------------------");
        int arr2[] = new int[8];
        plusThree(arr2);
        System.out.println("Task Three -------------------------------");
        int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("The array " + Arrays.toString(arr3) + " was changed to:");
        multiplicate(arr3);
        System.out.println("Task Four -------------------------------");
        int arr4[] = {1, 5, 3, 2, 11, 9};
        findMax(arr4);
        findMin(arr4);
        System.out.println("Task Five -------------------------------");
        int table[][] = new int[10][10];
        diagonalArray(table);
        System.out.println("Task Six -------------------------------");
        int arr6[] = {1, 2, 3, 4, 5};
        System.out.println("The array " + Arrays.toString(arr6) + " was shifted by " + "2" + ". New array: ");
        moveElements(arr6, 2);

        int arr6_1[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8};
        System.out.println("The array " + Arrays.toString(arr6_1) + " was shifted by " + "-8" + ". New array: ");
        moveElements(arr6_1, -8);
    }

    /**
     * 1) Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */
    public static void replace(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {            //works, may be changed using : ?
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 2)Задать пустой целочисленный массив размером 8. Написать метод,
     * который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
     */
    public static void plusThree(int array[]) {
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 3; //предыдущий элемент + 3
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 3) Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
     * принимающий на вход массив и умножающий числа меньше 6 на 2
     */
    public static void multiplicate(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 4) Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
     */
    public static void findMax(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("maximum of " + Arrays.toString(array) + " is " + max);
    }

    public static void findMin(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("minimum of " + Arrays.toString(array) + " is " + min);
    }

    /**
     * 5*) Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
     * заполнить его диагональные элементы единицами, используя цикл(ы);
     */
    public static void diagonalArray(int array[][]) {
        int k = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || i == k - j) {
                    array[i][j] = array[i][j] + 1;
                }
            }
        }
        for (int[] row : array)
            System.out.println(Arrays.toString(row));
    }

    /**
     * 6**) Написать метод, которому на вход подаётся одномерный массив и число value (может быть положительным,
     * или отрицательным), при этом метод должен циклически сместить все элементы массива на value позиций.
     * [1,2,3,4,5], -2 => [3,4,5,1,2]
     * [1,2,3,4,5], 2 => [4,5,1,2,3]
     */
    public static void moveElements(int array[], int value) {
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        } else {
            direction = false;
        }
        value %= array.length;
        int lastIndex = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[lastIndex];
            for (int j = 0; j < lastIndex; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[lastIndex - j] = array[lastIndex - j - 1];
            }
            if (direction)
                array[lastIndex] = temp;
            else
                array[0] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}