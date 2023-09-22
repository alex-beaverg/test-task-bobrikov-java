package org.example;

import java.util.Scanner;

/**
 * Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то
 * вывести "Нет такого имени"
 */
class Task02 {
    protected static void PrintHelloNameIfNameIsCorrect() {
        System.out.print("Enter name: ");
        Scanner input = new Scanner(System.in);
        String inputName = input.nextLine();
        if (inputName.equals("Вячеслав")) {
            System.out.printf("Привет, %s%n", inputName);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
