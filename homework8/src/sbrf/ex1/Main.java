package sbrf.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static <T extends Number> List<T> filter(List<T> arr, Predicate<T> filter) {
        List<T> res = new ArrayList<>();
        for (T elem : arr) {
            if (filter.test(elem)) {
                res.add(elem);
            }
        }

        return res;
    }

    public static <T> void print(List<T> array, Predicate<T> filter) {
        for (T elem : array) {
            if (filter.test(elem)) {
                System.out.print(elem + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-2,-1,0,1,2,3,4,5,6,7,8);

        print(arr, a -> a % 3 == 0);
        List<Integer> res1 = filter(arr, a -> a % 2 == 0);
        System.out.println(res1);

        List<Integer> res2 = filter(arr, a -> a > 0);
        System.out.println(res2);
    }
}
