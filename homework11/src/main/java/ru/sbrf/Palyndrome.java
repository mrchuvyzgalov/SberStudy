package ru.sbrf;

public class Palyndrome {
    public static boolean IsPalyndome(String word) throws IllegalArgumentException {
        if (word == null) {
            throw new IllegalArgumentException("word can not be null");
        }
        for (Character letter : word.toCharArray()) {
            if (!letter.equals(' ') && !Character.isLetter(letter)) {
                return false;
            }
        }
        String workWord = word.toLowerCase().replaceAll(" ", "");
        if (workWord.length() == 0) {
            return false;
        }
        for (int i = 0; i < workWord.length() / 2; ++i) {
            if (workWord.charAt(i) != workWord.charAt(workWord.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(IsPalyndome("12"));                         // false
        System.out.println(IsPalyndome("11"));                         // false
        try {
            System.out.println(IsPalyndome(null));                     // throw runtimeexseption
        }
        catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
        System.out.println(IsPalyndome(""));                           // false
        System.out.println(IsPalyndome("  "));                         // false
        System.out.println(IsPalyndome("a"));                          // true
        System.out.println(IsPalyndome("казак"));                      // true
        System.out.println(IsPalyndome("А роза упала на лапу Азора")); // true
        System.out.println(IsPalyndome("яЯ"));                         // true
        System.out.println(IsPalyndome("ты"));                         // false
        System.out.println(IsPalyndome("тык"));                        // false
    }
}

