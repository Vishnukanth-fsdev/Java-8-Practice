package Supplier;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class SupplierExample {
    public static void main(String[] args) {
        //Basic Supplier
        Supplier<String> greetSupp=()->"Hello World";
        System.out.println(greetSupp.get());

        //Current Time Supplier
        Supplier<LocalDateTime> time=()-> LocalDateTime.now();
        System.out.println(time.get());

        //Random Number Supplier
        Supplier<Double> random= ()->Math.random();
        System.out.println(random.get());

        //Object Supplier
        Supplier<List<String>> listSupplier=()-> new ArrayList<>();
        List<String> newList= listSupplier.get();
        System.out.println(newList.hashCode());

        // Specialized Suppliers: IntSupplier, DoubleSupplier, LongSupplier, BooleanSupplier
        IntSupplier intSupplier = () -> (int) (Math.random() * 100);
        DoubleSupplier doubleSupplier = Math::random;
        LongSupplier longSupplier = () -> System.currentTimeMillis();
        BooleanSupplier booleanSupplier = () -> Math.random() > 0.5;
        System.out.println("Random int: " + intSupplier.getAsInt());
        System.out.println("Random double: " + doubleSupplier.getAsDouble());
        System.out.println("Current millis: " + longSupplier.getAsLong());
        System.out.println("Random boolean: " + booleanSupplier.getAsBoolean());
    }
}
