package sbrf.task1;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer("Алексей", 20);
        swimmer.swim(System.out::println);
        Supplier<String> s = () -> swimmer.getName();
        System.out.println(s.get());
        BiConsumer<String, Integer> bc = (a, b) -> { swimmer.setName(a); swimmer.setAge(b);};
        bc.accept("Маша", 19);
        System.out.println(swimmer.getName());
    }
}
