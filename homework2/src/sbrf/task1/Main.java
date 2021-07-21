package sbrf.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt(), width = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        if (length < 3 || width - 2 < str.length()) {
            System.out.println("Ошибка");
        }
        else {
            for (int i = 0; i < width; ++i) {
                System.out.print('*');
            }
            for (int i = 1; i < (length - 2)/ 2 + length % 2; ++i) {
                System.out.print("\n*");
                for (int j = 1; j < width - 1; ++j) {
                    System.out.print(' ');
                }
                System.out.print('*');
            }
            System.out.print("\n*");
            for (int i = 1; i < (width - str.length()) / 2; ++i) {
                System.out.print(' ');
            }
            System.out.print(str);
            for (int i = (width - str.length()) / 2 + str.length(); i < width - 1; ++i) {
                System.out.print(' ');
            }
            System.out.println('*');

            for (int i = (length - 2)/ 2 + 1 + length % 2; i < length - 1; ++i) {
                System.out.print("*");
                for (int j = 1; j < width - 1; ++j) {
                    System.out.print(' ');
                }
                System.out.println('*');
            }
            for (int i = 0; i < width; ++i) {
                System.out.print('*');
            }
        }
    }
}
