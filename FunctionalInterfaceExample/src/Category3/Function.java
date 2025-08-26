package Category3;

// Category 3: Functions - Accept Input, Return Output
//Function<T, R> - T input, R output
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
