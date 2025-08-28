package Function;

// BiFunction<T, U, R> - Two inputs, R output
@FunctionalInterface
public interface BiFunction<T,U,R> {
    R apply(T t,U u);
}
