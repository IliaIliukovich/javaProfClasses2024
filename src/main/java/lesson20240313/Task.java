package lesson20240313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String current = iterator.next();
            if (current != null && current.length() == 4) {
                System.out.println(current);
            }
        }

    }


}
