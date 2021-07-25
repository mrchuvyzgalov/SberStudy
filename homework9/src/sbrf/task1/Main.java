package sbrf.task1;

import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.generate(() -> {
            Integer res = 0;
            do {
                res = (int)(Math.random() * 100);
            } while (res == 0);
            if (Math.random() <= 0.5) res *= -1;
            return res;
        }
        );
        Set<Integer> set = stream.filter(x -> x > 0 && x % 2 == 1).map(x -> x * 2).peek(System.out::println).limit(15).collect(Collectors.toSet());
        System.out.println("Sum = " + set.stream().reduce((a,b) -> a + b).get());
    }
}
