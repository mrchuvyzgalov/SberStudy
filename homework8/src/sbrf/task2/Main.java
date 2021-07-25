package sbrf.task2;

public class Main {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> tri = (a, b, c) -> a + b + c;
        QuardFunction<Integer, Integer, Integer, Integer, Integer> quard = (a, b, c, d) -> a + b + c + d;
        System.out.println(tri.apply(1, 2, 3));
        System.out.println(quard.apply(1, 2, 3, 4));
    }
}
