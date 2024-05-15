package lesson20240325.hometask;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Hometasks {


    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(4);
        integers.add(2);
        integers.add(5);
        integers.add(10);
        integers.add(20);
        integers.add(9);

        NavigableSet<Integer> integers1 = integers.descendingSet();
        SortedSet<Integer> set = integers.headSet(7);

        for (Integer i : integers) {
            if (i < 7) {
                System.out.println(i);
            } else {
                break;
            }
        }


    }


}
