package lesson20240417;

import lesson20240318.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("A", "B", "C", "D", "F");

        List<String> stringList = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        List<String> result = stringList.stream().filter(string -> string.length() == 3).toList();
        System.out.println(result);
        List<String> wordStartingFromT = stringList.stream().filter(string -> string.startsWith("T")).toList();
        System.out.println(wordStartingFromT);

        stringList.stream().filter(string -> string.startsWith("F")).toList().stream().forEach(System.out::println);

        System.out.println("sorted()");
        stringList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("skip(), limit()");
        result = stringStream.skip(2).limit(2).toList();
        System.out.println(result);

        List<Integer> integerList = Arrays.asList(23, 0, 11, 32, 65, 77, 12, 12, 87, 0);
        integerList.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("distinct()");
        List<Integer> distinctIntegers = integerList.stream().sorted().distinct().toList();
        System.out.println(distinctIntegers);

        System.out.println("peek()");
        List<Integer> integerResult = integerList.stream().filter(i -> i % 2 == 0).peek(System.out::println).sorted().toList();
        System.out.println(integerResult);

        System.out.println("map()");
        List<Integer> lengths = stringList.stream().map(String::length).distinct().sorted().toList();
        System.out.println(lengths);

        List<Employee> employees = Stream.of("Ivan", "John", "Mary", "Jenny").map(name -> new Employee(name, "Surname", 24, 40)).toList();
        System.out.println(employees);

    }



}
