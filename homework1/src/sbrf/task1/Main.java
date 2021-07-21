package sbrf.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // считывание данных
        Scanner in = new Scanner(System.in);
        long k = in.nextLong();

        // получение длины числа с искомой цифрой и ее нового номера
        int len = 1;
        long countOfNumbers = 9;
        long countOfDigits = countOfNumbers * len;

        while (k >= countOfDigits) {
            k -= countOfDigits;
            countOfNumbers *= 10;
            len++;
            countOfDigits = countOfNumbers * len;
        }

        // получение самого числа и номер искомой цифры с конца
        long number = k / len + countOfNumbers / 9;
        int numbOfDigit = len - (int)(k % len);

        // идем справа от числа, чтобы получить искомую цифру
        for (int i = 1; i < numbOfDigit; ++i) {
            number /= 10;
        }
        System.out.println(number % 10);
    }
}
