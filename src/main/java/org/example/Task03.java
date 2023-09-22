package org.example;

/**
 * Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */
class Task03 {
    protected static void PrintMultipleOfThreeElementsFromArray(int[] array) {
        System.out.print("Числа из массива, кратные трем: ");
        for (int number: array) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
