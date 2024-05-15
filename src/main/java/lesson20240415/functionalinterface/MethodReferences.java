package lesson20240415.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        Consumer<String> consumer2 = System.out::println;
        Consumer<String> complexConsumer = s -> System.out.println("Consumer " + s);


        MethodReferences methodReferences = new MethodReferences();

        Consumer<Integer> consumer3 = methodReferences::customConsumer;
//        Consumer<Integer> consumer4 = integer -> methodReferences.customConsumer(integer);
        consumer3.accept(100);

        Function<String, String> function = MethodReferences::customFunction;
//        Function<String, String> function2 = s -> MethodReferences.customFunction(s);
        System.out.println(function.apply("String"));

        Supplier<MethodReferences> supplier = MethodReferences::new;
        MethodReferences entity = supplier.get();
    }


    public void customConsumer(Integer data) {
        System.out.println("customConsumer: " + data);
//        this.extraMethod(data);
        Consumer<Integer> consumer = this::extraMethod;
        consumer.accept(data);
    }

    private void extraMethod(Integer data) {
        System.out.println("extraMethod: " + data);
    }

    public static String customFunction(String data) {
        return "{" + data + "}";
    }


}
