package sbrf.myinteger;

public abstract class MyInteger {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyInteger() {
        number = 0;
    }

    public MyInteger(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
