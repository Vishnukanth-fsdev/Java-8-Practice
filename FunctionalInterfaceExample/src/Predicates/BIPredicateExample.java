package Predicates;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class BIPredicateExample {
    public static void main(String[] args) {
        //String Comparison
        BiPredicate<String,String> areEqual=String::equals;
        System.out.println(areEqual.test("Hello","Hello"));

        //Number Comparison
        BiPredicate<Integer,Integer> isGreater=(a,b)-> a >b;
        System.out.println(isGreater.test(0,05));

        //Complex condition
        BiPredicate<String, Integer> isLongEnough = (s, minLength) -> s.length() >= minLength;
        System.out.println(isLongEnough.test("Hello", 3));

        // Specialized Predicates: IntPredicate, DoublePredicate, LongPredicate
        IntPredicate isEven = i -> i % 2 == 0;
        DoublePredicate isPositive = d -> d > 0;
        LongPredicate isLarge = l -> l > 1000;
        System.out.println(isEven.test(5));
        System.out.println(isPositive.test(5));
        System.out.println(isLarge.test(2000));
    }
}
