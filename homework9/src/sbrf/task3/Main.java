package sbrf.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Вася", 70D);
        map.put("Кирилл", 65D);
        map.put("Игнат", 80D);

        System.out.println((map.entrySet().stream().map(a -> a.getValue()).reduce((a,b) -> a + b)).get() / map.size());
    }
}
