package summary20240614;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Hometask {

    // Составить массив с большим объемом тестовых данных. С помощью стримов отсортировать данные
    //- последовательно
    //- параллельно
    // Замерить и сравнить затраченное время.

    public static void main(String[] args) {
        Random random = new Random();
        int size = 100_000_000;

        int[] testData = IntStream.range(0, size).map(i -> random.nextInt(1000)).toArray();

//        Arrays.sort(testData);

        long start = System.currentTimeMillis();
        int[] result = Arrays.stream(testData).sorted().toArray();
        long end = System.currentTimeMillis();
        System.out.println("Time, ms: " + (end - start));

        start = System.currentTimeMillis();
        result = Arrays.stream(testData).parallel().sorted().toArray();
        end = System.currentTimeMillis();
        System.out.println("Time, ms: " + (end - start));

        // 100 ТБ
        // 1 Гб 1 Гб 1 Гб 1 Гб
        // 1 Гб 1 Гб 1 Гб 1 Гб sorted data
        // merge

    }




}
