package sbrf.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Кирилл", "Дима", "Маша");
        List<String> l2 = Arrays.asList("Леша", "Миша", "Кирилл", "Влад", "Рома", "Настя");
        List<String> l3 = Arrays.asList("Леша", "Саша", "Оля", "Паша");
        List<String> l4 = Arrays.asList("Полина", "Леша", "Илья", "Кирилл", "Кирилл");

        Stream<List<String>> stream = Stream.of(l1, l2, l3, l4);
        List<String> words = stream.flatMap(x -> x.stream()).distinct().collect(Collectors.toList());
        System.out.println(words);
    }
}
