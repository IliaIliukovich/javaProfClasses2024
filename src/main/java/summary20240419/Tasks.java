package summary20240419;


import lesson20240219.house.Animal;
import lesson20240219.house.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Tasks {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        fill2(integers, 5);
        System.out.println(integers);
    }

    public static void feed(List<Cat> catList) {
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).isHungry()) {
                catList.get(i).setHungry(false);
            }
        }
    }

    public static void feed2(List<Cat> catList) {
        catList.stream().filter(Animal::isHungry).forEach(cat -> cat.setHungry(false));
    }

    public static void feed3(List<Cat> catList) {
        catList.forEach(cat -> cat.setHungry(false));
    }

    public static void fill(List<Integer> list, int capacity) {
        for (int i = 0; i < capacity; i++) {
            list.add(i);
        }
    }


    public static void fill2(List<Integer> list, int capacity) {
        IntStream.range(0, capacity).forEach(list::add);
    }

}
