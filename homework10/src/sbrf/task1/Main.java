package sbrf.task1;

import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static Optional<Double> divide(int a, int b) {
        if (b == 0) {
            return Optional.empty();
        }
        return Optional.of((double)a / b);
    }
    public static void main(String[] args) {
        divide(1, 2).ifPresent(System.out::println);
        divide(1, 0).ifPresent(System.out::println);
    }
}
