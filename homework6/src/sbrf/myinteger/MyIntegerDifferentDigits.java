package sbrf.myinteger;

import java.util.HashSet;
import java.util.Set;

public class MyIntegerDifferentDigits extends MyInteger implements Comparable<MyIntegerDifferentDigits> {
    public MyIntegerDifferentDigits() {
        super();
    }

    public MyIntegerDifferentDigits(int number) {
        super(number);
    }

    private int countOfDifferentDigits() {
        Set<Integer> digits = new HashSet<>();

        int tmpNumber = getNumber();

        do {
            digits.add(tmpNumber % 10);
            tmpNumber /= 10;
        } while (tmpNumber != 0);

        return digits.size();
    }

    @Override
    public int compareTo(MyIntegerDifferentDigits o) {
        return Integer.compare(countOfDifferentDigits(), o.countOfDifferentDigits());
    }
}
