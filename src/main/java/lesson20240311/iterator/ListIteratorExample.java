package lesson20240311.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        ListIterator<Integer> listIterator = integerList.listIterator();

//        while (listIterator.hasNext()) {
//            Integer next = listIterator.next();
//            System.out.println(next);
//        }
//
//        while (listIterator.hasPrevious()) {
//            Integer previous = listIterator.previous();
//            System.out.println(previous);
//        }

        listIterator.next();
        listIterator.next();
        listIterator.next();
        listIterator.next();
        System.out.println(listIterator.previous());
        listIterator.remove();
        listIterator.add(999);

        System.out.println(integerList);
    }



}
