package Consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Basic Consumer
        Consumer<String> printer= s -> System.out.println(s);
        printer.accept("Hello World");

        //Method Reference Example
        Consumer<String> printer1=System.out::println;
        printer1.accept("Hello Vishnukanth");

        //Practical With Collections
        List<String> names=List.of("Ramu","Veeru","Siddu");
        names.forEach(printer);

    }
}
