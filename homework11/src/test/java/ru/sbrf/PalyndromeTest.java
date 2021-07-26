package ru.sbrf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalyndromeTest {

    @Test
    public void testEmptyWord() throws Exception {
        boolean result = Palyndrome.IsPalyndome("");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testBlankWord() throws Exception {
        boolean result = Palyndrome.IsPalyndome("    ");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testDigitsWord() throws Exception {
        boolean result = Palyndrome.IsPalyndome("12");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testPalyndromeDigitsWord() throws Exception {
        boolean result = Palyndrome.IsPalyndome("11");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testOneLetter() throws Exception {
        boolean result = Palyndrome.IsPalyndome("a");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testTwoEqualsLetters() throws Exception {
        boolean result = Palyndrome.IsPalyndome("яЯ");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testSequence() throws Exception {
        boolean result = Palyndrome.IsPalyndome("А роза упала на лапу Азора");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testPalyndromeWord() throws Exception {
        boolean result = Palyndrome.IsPalyndome("казак");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testNoPalyndromeWordHasTwoLetters() throws  Exception {
        boolean result = Palyndrome.IsPalyndome("ты");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testNoPalyndromeWordHasThreeLetters() throws Exception {
        boolean result = Palyndrome.IsPalyndome("тык");
        Assertions.assertEquals(false, result);
    }
}
