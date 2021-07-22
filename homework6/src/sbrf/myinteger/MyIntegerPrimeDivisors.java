package sbrf.myinteger;

public class MyIntegerPrimeDivisors extends MyInteger implements Comparable<MyIntegerPrimeDivisors> {
    private int getCountOfPrimeDivisors() {
        int count = 0;
        int tmpNumber = getNumber();
        int prison = 2;
        while (tmpNumber != 1) {
            if (tmpNumber % prison == 0) {
                count++;
                while (tmpNumber % prison == 0) {
                    tmpNumber /= prison;
                }
            }
            prison++;
        }
        return count;
    }

    @Override
    public int compareTo(MyIntegerPrimeDivisors o) {
        return Integer.compare(getCountOfPrimeDivisors(), o.getCountOfPrimeDivisors());
    }

    public MyIntegerPrimeDivisors() {
        super();
    }

    public MyIntegerPrimeDivisors(int number) {
        super(number);
    }


}
