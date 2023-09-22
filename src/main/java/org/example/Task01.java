package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 */
class Task01 {

    protected static void PrintHelloIfInputNumberOverSeven() {

        System.out.print("Enter your number: ");
        Scanner input = new Scanner(System.in);
        try {
            int inputNumber = input.nextInt();
            if (inputNumber > 7) {
                System.out.println("Привет");
            }
        } catch (InputMismatchException ignored) {}
    }
}
