package lesson20240424;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure <T> implements Comparable<T> {

    private T t;

    @Override
    public int compareTo(T o) {
        return 0;
    }

//    public int compareTo(Object o) { // impossible because of type erasure
//        return 0;
//    }

    public int compareTo(Integer integer) { // possible
        return 0;
    }


    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        String[] strings = new String[5];

        System.out.println(integers.getClass());
        System.out.println(strings.getClass());
        System.out.println(integers.getClass().equals(strings.getClass()));

        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        System.out.println(integerList.getClass());
        System.out.println(stringList.getClass());
        System.out.println(integerList.getClass().equals(stringList.getClass())); // type erasure

    }


}
