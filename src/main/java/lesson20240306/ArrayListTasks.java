package lesson20240306;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTasks {


    public static void main(String[] args) {

    // 1. У вас есть список значений int, вы должны вернуть список, каждое значение которого умножается на 2
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        for (int i = 0; i < integers.size(); i++) {
            integers.set(i, integers.get(i) * 2);
        }
        System.out.println(integers);


    // 2.У вас есть список значений String, вы должны вернуть список этих значений без каких-либо дубликатов
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("world");
        strings.add("!!!");
        strings.add("!!!");
        strings.add("world");
        List<String> newList = removeDuplicates(strings);
        System.out.println(newList);

    // 3.У вас есть список значений String, вы должны вернуть одну строку,
    // которая представляет собой конкатенацию всех значений.
        strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s);
        }
        String stringResult = result.toString();
        System.out.println(stringResult);

    // 4. Напишите метод для объединения двух списков в один общий ArrayList
        List<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        List<Integer> integers2 = new ArrayList<>();
        integers2.add(4);
        integers2.add(5);

        List<Integer> united = unite(integers1, integers2);
        System.out.println(united);
    }

    public static List<Integer> unite(List<Integer> integers1, List<Integer> integers2) {
        List<Integer> result = new ArrayList<>();
        result.addAll(integers1);
        result.addAll(integers2);
        return result;
    }

    public static List<String> removeDuplicates(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }


}
