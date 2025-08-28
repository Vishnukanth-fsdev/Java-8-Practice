package Predicates;
import java.util.List;
import java.util.function.Predicate;
public class PredicateExample {
    public static void main(String[] args) {
        //Basic Predicates
        Predicate<String> isEmpty=s->s.isEmpty();
        Predicate<String> isLong=s->s.length()>10;
        System.out.println(isEmpty.test(""));
        System.out.println(isLong.test("HelloWorldddddd"));

        //Predicate Chaining
        Predicate<String> isNotEmpty=isEmpty.negate();
        Predicate<String> isLongNotString=isNotEmpty.and(isLong);
        System.out.println(isLongNotString.test("Hello World"));

        //Predicate Chaining
        List<String> names=List.of("abc","def","ghi");
        names.stream()
                .filter(isNotEmpty.and(isLong.negate()))
                .forEach(System.out::println);


    }
}
