package sbrf;

import java.util.Iterator;

public class MyInteger implements Iterable<Integer> {
    private Integer number;

    public MyInteger() {
        number = 0;
    }

    public MyInteger(Integer number) throws IllegalArgumentException {
        if (number == null || number < 0) {
            throw new IllegalArgumentException("Число не может быть пустым или отрицательным");
        }
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) throws IllegalArgumentException {
        if (number == null || number < 0) {
            throw new IllegalArgumentException("Число не может быть пустым или отрицательным");
        }
        this.number = number;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIntegerIterator();
    }

    public class MyIntegerIterator implements Iterator<Integer> {
        boolean isFinish = false;
        Integer tmpNumber = Integer.valueOf(number);

        @Override
        public boolean hasNext() {
            return !isFinish;
        }

        @Override
        public Integer next() {
            Integer res = tmpNumber % 10;
            if (tmpNumber < 10 ) {
                isFinish = true;
            }
            tmpNumber /= 10;
            return res;
        }
    }
}
