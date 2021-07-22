package sbrf;

public class Main {
    public static void main(String[] args) {
        MyInteger number = new MyInteger(987654321);
        for (Integer digit : number) {
            System.out.println(digit);
        }
    }
}
