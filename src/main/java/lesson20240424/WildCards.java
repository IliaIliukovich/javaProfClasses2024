package lesson20240424;

import java.util.ArrayList;
import java.util.List;

public class WildCards {

    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>(1);
        Box<Double> box2 = new Box<>(1.0);
//        Box<String> box3 = new Box<>("ABC");

        List<? extends Number> list = new ArrayList<Integer>();
        list = new ArrayList<Double>();
        list = new ArrayList<Number>();

        List<?> list2;
//        List<? extends Object> list2;

        List<? super Double> list3;
    }


    static class Box <T extends Number> {
        private T t;

        public Box(T t) {
            this.t = t;
        }
    }




}
