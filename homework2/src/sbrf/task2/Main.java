package sbrf.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        if (n == 0) {
            System.out.println(0);
        }
        else if (n == 1) {
            System.out.println(1);
        }
        else if (n == 2) {
            System.out.println(10);
        }
        else {
            long f1 = 1, f2 = 2, f3 = f1 + f2;
            while (f2 + f3 < n) {
                f1 = f2;
                f2 = f3;
                if (Long.MAX_VALUE - f2 >= f1) {
                    f3 = f1 + f2;
                }
                else {
                    break;
                }
            }
            System.out.print(1);
            n -= f3;
            while (f3 > 1) {
                f3 = f2;
                f2 = f1;
                f1 = f3 - f2;
                if (f3 <= n) {
                    System.out.print(1);
                    n -= f3;
                }
                else {
                    System.out.print(0);
                }
            }
        }
    }
}
