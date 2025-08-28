package Consumer;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        //Basic Consumer
        BiConsumer<String,Integer> pairPrinter=(name,age) -> System.out.println(name +" is "+age+"years old");
        pairPrinter.accept("Vishnukanth",25);

        //Practical using maps
        Map<String, Integer> ageMap=Map.of("Ramu",25,"Siddu",24,"Veeru",28);
        BiConsumer<String,Integer> mapPrin=(key,value)-> System.out.println(key+" "+value);
        ageMap.forEach(mapPrin);

        // Specialized Consumers: IntConsumer, DoubleConsumer, LongConsumer

        IntConsumer intConsumer = i -> System.out.println("Integer: " + i);
        DoubleConsumer doubleConsumer = d -> System.out.println("Double: " + d);
        LongConsumer longConsumer = l -> System.out.println("Long: " + l);
        intConsumer.accept(42);
        doubleConsumer.accept(3.14);
        longConsumer.accept(1000000L);
    }
}
