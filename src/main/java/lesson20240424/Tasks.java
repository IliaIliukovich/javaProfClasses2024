package lesson20240424;


import java.util.Arrays;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
        // 1. Создать generic класс Box<Item>, в котором можно хранить предметы любого типа.
        // Реализовать методы:
        // - put(Item item) - положить предмет
        // - get() - извлечь предмет
        // - remove() - извлечь и удалить предмет
        Box<String> box = new Box<>();
        box.put("item");
        System.out.println(box.get());
        box.remove();
//        System.out.println(box.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.put(10.0);


        // 2. Написать generic метод makeList(), который преобразует массив в список.
        List<Integer> integerList = makeList(new Integer[] {1, 2, 3});
        List<String> stringList = makeList(new String[] {"A", "B", "C"});

        // 3. Написать generic метод makeArray(), который преобразует список в массив.
        Object[] integers = makeArray(integerList);
        System.out.println(Arrays.toString(integers));
        Object[] strings = makeArray(stringList);
        System.out.println(Arrays.toString(strings));
    }

    public static <T> List<T> makeList(T[] tArray) {
        return Arrays.asList(tArray);
    }

    public static <T> Object[] makeArray(List<T> list) {
//        T[] t = new T[list.size()]; // impossible
//        T[] t = (T[]) new Object[list.size()];
//        int i = 0;
//        for (T element : list) {
//            t[i++] = element;
//        }
//        return t;
        return list.toArray();
    }


}
