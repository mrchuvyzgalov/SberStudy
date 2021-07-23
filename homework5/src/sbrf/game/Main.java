package sbrf.game;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Игра 'Балда'");
        System.out.print("Введите слово: ");

        Scanner in = new Scanner(System.in);
        String word = in.nextLine().toLowerCase(Locale.ROOT);

        Set<Character> alphabet = new HashSet<>();
        for (Character letter : word.toCharArray()) {
            alphabet.add(letter);
        }

        boolean firstWin = false, secondWin = false;
        boolean firstStep = true;

        Set<String> words = new HashSet<>();

        while (!firstWin && !secondWin) {
            if (firstStep) {
                System.out.print("Слово первого игрока: ");
                String newWord = in.nextLine();
                if (!IsCorrect(alphabet, newWord) || words.contains(newWord)) {
                    System.out.println("Слово некорректно или уже было названо");
                    secondWin = true;
                }
                else {
                    words.add(newWord);
                }
            }
            else {
                System.out.print("Слово второго игрока: ");
                String newWord = in.nextLine();
                if (!IsCorrect(alphabet, newWord) || words.contains(newWord)) {
                    System.out.println("Слово некорректно или уже было названо");
                    firstWin = true;
                }
                else {
                    words.add(newWord);
                }
            }

            firstStep = !firstStep;
        }

        if (firstWin) {
            System.out.println("Победил первый игрок");
        }
        else {
            System.out.println("Победил второй игрок");
        }
    }

    public static boolean IsCorrect(Set<Character> alphabet, String word) {
        for (Character letter : word.toCharArray()) {
            if (!alphabet.contains(letter)) {
                return false;
            }
        }
        return true;
    }
}
