package Function;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;
import java.util.function.LongToDoubleFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // String concatenation
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
        System.out.println(concat.apply("Hello", "World")); // HelloWorld

        // Mathematical operations
        BiFunction<Integer, Integer, Integer> multiplier = (a, b) -> a * b;
        System.out.println(multiplier.apply(5, 3)); // 15

        // Complex operation
        BiFunction<String, Integer, String> repeater = (s, count) -> s.repeat(count);
        System.out.println(repeater.apply("Java", 3)); // JavaJavaJava

        // Primitive type functions
        IntFunction<String> intToString = i -> "Number: " + i;
        DoubleToIntFunction doubleToInt = d -> (int) d;
        LongToDoubleFunction longToDouble = l -> (double) l;
        System.out.println(intToString.apply(42));
        System.out.println(doubleToInt.applyAsInt(3.14));
        System.out.println(longToDouble.applyAsDouble(1000000L));
    }
}
