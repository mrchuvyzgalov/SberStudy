package sbrf.myqueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; ++i) {
            String command = scanner.nextLine();

            if (command.equals("EMPTY")) {
                if (myQueue.IsEmpty()) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else if (command.equals("DEQ")) {
                System.out.println(myQueue.remove());
            } else {
                String[] words = command.split(" ");
                int number = Integer.parseInt(words[1]);
                myQueue.add(number);
            }
        }
    }
}
