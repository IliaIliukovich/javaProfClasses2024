package lesson20240617;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hometask {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // vm options to make this code execute: --add-opens java.base/java.util=ALL-UNNAMED

        List<String> list = new ArrayList<>();
        list.add("A");

        Class<? extends List> listClass = list.getClass();
        Field field = listClass.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println(elementData.length);
        System.out.println(Arrays.toString(elementData));
    }


}
