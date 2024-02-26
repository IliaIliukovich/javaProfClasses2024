package lesson20240226.interfaces;

public interface SomeInterface {

    int number = 10; // public static final

    void someMethod(); // public abstract

    String someMethod(String s); // public abstract

    static void staticMethod() { // public
        System.out.println("staticMethod in interface");
    }

    default void defaultMethod() { // public
        System.out.println("defaultMethod in interface");
    }

}
