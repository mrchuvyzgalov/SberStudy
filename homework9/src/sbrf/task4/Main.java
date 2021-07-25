package sbrf.task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = Stream.iterate(1, x -> x + 2).limit(100).collect(Collectors.toList());
        List<Integer> l2 = Stream.iterate(1, x -> x + 8).limit(100).collect(Collectors.toList());
        System.out.println(l1.stream().filter(x -> l2.contains(x)).collect(Collectors.toList()));
    }
}
