package lesson20240522;

import summary20240510.UserValidation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElements {

    public static int[] find(int[] array1, int[] array2) {  // O(n)
        if (array1 == null || array2 == null) {
            return new int[0];
        }
        Set<Integer> set1 = Arrays.stream(array1).boxed().collect(Collectors.toCollection(HashSet::new));
        Set<Integer> result = new HashSet<>();
        for (int element : array2) {
            if (set1.contains(element)) {
                result.add(element);
            }
        }

//        UserValidation.checkLoginAndPassword("", "", "");
        return result.stream().mapToInt(value -> value).toArray();
    }


}
