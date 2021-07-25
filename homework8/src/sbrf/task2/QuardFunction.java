package sbrf.task2;

@FunctionalInterface
public interface QuardFunction<F, S, T, U, R> {
    R apply(F f, S s, T t, U u);
}
