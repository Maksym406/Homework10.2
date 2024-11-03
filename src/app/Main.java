package app;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число для обчислення його квадрата: ");
        int number = scanner.nextInt();
        printSquare(number);

        System.out.print("\nВведіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double cylinderVolume = calculateCylinderVolume(radius, height);
        System.out.printf("Радіус: %.2f, Висота: %.2f. Об'єм циліндра: %.2f\n", radius, height, cylinderVolume);

        int[] array = generateRandomArray(10, 1, 100); // Генерація масиву з 10 випадкових чисел
        System.out.print("\nЗгенерований масив: ");
        displayArray(array);
        int sum = calculateArraySum(array);
        System.out.println("Сума елементів масиву: " + sum);

        System.out.print("\nВведіть рядок для реверсу: ");
        scanner.nextLine();
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Реверс рядка: " + reversedString);

        System.out.print("\nВведіть два цілі числа (a і b) для обчислення a^b:\nЧисло a: ");
        int a = scanner.nextInt();
        System.out.print("Число b: ");
        int b = scanner.nextInt();
        int powerResult = power(a, b);
        System.out.println("Результат " + a + "^" + b + ": " + powerResult);

        System.out.print("\nВведіть рядок для повторення: ");
        scanner.nextLine();
        String text = scanner.nextLine();
        System.out.print("Введіть кількість повторень: ");
        int n = scanner.nextInt();
        printTextNTimes(n, text);

        scanner.close();
    }

    public static void printSquare(int num) {
        int square = num * num;
        System.out.println("Квадрат числа " + num + " = " + square);
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.print(text + "\n");
        }
    }
}