package Category3;
import java.util.function.Function;
public class FunctionExample {
    public static void main(String[] args) {
        //String to integer conversion
        Function<String, Integer> stringToInt=Integer::parseInt;
        System.out.println(stringToInt.apply("123"));

        //String length
        Function<String, Integer> strlen= String::length;
        System.out.println(strlen.apply("Hello World"));

        //Chaining function with addThen()
        Function<String,String> toUpper=String::toUpperCase;
        Function<String,String> addExc=s->s+" ! ";
        Function<String,String> addProc=toUpper.andThen(addExc);
        System.out.println(addProc.apply("Hello"));

        Function<String, String> processString = toUpper.andThen(addExc);
        System.out.println(processString.apply("hello"));

        // Chaining with compose() - reverse order
        Function<String, String> processString2 = addExc.compose(toUpper);
        System.out.println(processString2.apply("hello")); // HELLO!

    }
}
