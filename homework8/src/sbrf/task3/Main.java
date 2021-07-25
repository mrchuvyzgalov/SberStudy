package sbrf.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    static <T, R> List<R> map(List<T> origin, Function<T, R> mapper) {
        List<R> res = new ArrayList<>();
        for (T elem : origin) {
            res.add(mapper.apply(elem));
        }
        return res;
    }
    static <T> void forEach(List<T> origin, Consumer<T> consumer) {
        for (T elem : origin) {
            consumer.accept(elem);
        }
    }
    static <T> List<T> filter(List<T> origin, Predicate<T> predicate) {
        List<T> res = new ArrayList<>();
        for (T elem : origin) {
            if (predicate.test(elem)) {
                res.add(elem);
            }
        }
        return res;
    }
    static <T> Integer count(List<T> origin, Predicate<T> predicate) {
        Integer count = 0;
        for (T elem : origin) {
            if (predicate.test(elem)) {
                count++;
            }
        }
        return count;
    }
    static <T> T foldL(List<T> origin, BinaryOperator<T> binaryOperator) {
        if (origin.size() == 0) {
            return null;
        }
        if (origin.size() == 1) {
            return origin.get(0);
        }
        T res = binaryOperator.apply(origin.get(0), origin.get(1));
        for (int i = 2; i < origin.size(); ++i) {
            res = binaryOperator.apply(res, origin.get(i));
        }
        return res;
    }

    static <T> T foldR(List<T> origin, BinaryOperator<T> binaryOperator) {
        if (origin.size() == 0) {
            return null;
        }
        if (origin.size() == 1) {
            return origin.get(0);
        }
        T res = binaryOperator.apply(origin.get(origin.size() - 2), origin.get(origin.size() - 1));
        for (int i = origin.size() - 3; i >= 0; --i) {
            res = binaryOperator.apply(origin.get(i), res);
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> origin = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Map: " + map(origin, a -> a + 1));
        System.out.println("ForEach:");
        forEach(origin, System.out::println);
        System.out.println("Count: " + count(origin, a -> a % 2 == 0));
        System.out.println("FoldL: " + foldL(origin, (a, b) -> a + b));
        System.out.println("FoldR: " + foldR(origin, (a, b) -> a + b));
    }
}
