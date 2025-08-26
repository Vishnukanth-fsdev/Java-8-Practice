package Basic;
@FunctionalInterface
interface MyFunctionalInterface {
    void execute(); // Single abstract method

    // Allowed: default methods
    default void log(String message) {
        System.out.println("Log: " + message);
    }

    // Allowed: static methods
    static void staticMethod() {
        System.out.println("Static method");
    }
}