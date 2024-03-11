package lesson20240311;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTasks {

    // Дан список из числовых данных.
    // С помощью итератора:
    // a). Напечатать только четные числа из списка.
    // b). Удалить из списка все числа, заканчивающиеся на 0.
    // c). Составить список квадратов чисел.

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 23, 30));

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current % 2 == 0) {
                System.out.println(current);
            }
        }

        iterator = integerList.iterator();
        while (iterator.hasNext()){
            Integer current = iterator.next();
            if (current % 10 == 0) {
                iterator.remove();
            }
        }
        System.out.println(integerList);

        iterator = integerList.iterator();
        List<Integer> newList = new ArrayList<>();
        while (iterator.hasNext()){
            Integer current = iterator.next();
            newList.add(current * current);
        }
        System.out.println(newList);

    }





}
