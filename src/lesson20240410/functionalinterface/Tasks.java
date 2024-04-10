package lesson20240410.functionalinterface;

import lesson20240318.Employee;

import java.util.function.*;

public class Tasks {

    static class Bot {

    }

    public static void main(String[] args) {

    // 1. Создать Supplier generateBot, который выдает пользователю экземпляр класса Bot.
        Supplier<Bot> generateBot = () -> new Bot();
        Bot bot1 = generateBot.get();
        Bot bot2 = generateBot.get();
        Bot bot3 = generateBot.get();

    // 2. Создать Consumer, который принимает числа и печатает их в формате "---123---".
        Consumer<Integer> printNumber = (integer -> System.out.println("---" + integer + "---"));
        printNumber.accept(123);

    // 3. Создать Predicate isAdultEmployee, который проверяет, что возраст Employee больше 18.
        Employee employee = new Employee("John", "Smith", 23, 40);
        Predicate<Employee> isAdultEmployee = e -> e.getAge() >= 18;
        System.out.println(isAdultEmployee.test(employee));

    // 4. Создать Function, которая вычисляет сумму чисел от 1 до n включительно.
        int n = 5;
        UnaryOperator<Integer> sum = (number) -> {
            int count = 0;
            for (int i = 1; i <= number ; i++) {
                count += i;
            }
            return count;
        };
        System.out.println(sum.apply(n));
    }



}
