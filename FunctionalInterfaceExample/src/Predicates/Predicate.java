package Predicates;

@FunctionalInterface
public interface Predicate<T> {
    boolean Test(Throwable test);
}
