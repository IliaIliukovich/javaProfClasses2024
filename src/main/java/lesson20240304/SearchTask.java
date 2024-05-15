package lesson20240304;

import java.util.Arrays;

public class SearchTask {

    public static void main(String[] args) {
        String[] data = {"A", "D", "B", "F"};

        System.out.println(findIndex(data, "D"));

        int[] sortedData = {2, 4, 6, 9, 20};
//        System.out.println(findIndexBinarySearch(sortedData, 9));
        System.out.println(Arrays.binarySearch(sortedData, 9)); // -5 ------> 4
        System.out.println(Arrays.binarySearch(sortedData, 10)); // -5 ------> 4


    }

    public static int findIndex(String[] data, String element) { // linear search
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static int findIndexBinarySearch(int[] sortedData, int element) {
        // TODO

        return 0;
    }

}
