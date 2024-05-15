package summary20240426;

import lesson20240219.house.Cat;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hometasks {

    public static void main(String[] args) {
        List<Optional<String>> list = Arrays.asList(Optional.of("A"), Optional.of("B"), Optional.empty());
        List<String> strings = list.stream().flatMap(Optional::stream).toList();
        System.out.println(strings);


        Cat cat1 = new Cat("Tom", "black", 2);
        Cat cat2 = new Cat("Mikky", "white", 1);
        Cat cat3 = new Cat("Vasya", "white", 3);
        Cat cat4 = new Cat("Steve", "grey", 1);
        Cat cat5 = new Cat("Bob", "black", 5);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);

        // Получить Map<Integer, Integer> возраст / количество белых кошек данного возраста
        Map<Integer, Integer> whiteCatsByAge = catList.stream().collect(
                Collectors.toMap(Cat::getAge, cat -> cat.getColour().equals("white") ? 1 : 0, Integer::sum));
        System.out.println(whiteCatsByAge);

        // Составить все возможные тройки пифагоровых чисел от 1 до 1000
        //Пифагоровой тройкой называют три натуральных числа, из которых можно составить прямоугольный треугольник
        //a^2 + b^2 = c^2
        //[3, 4, 5]
        //[6, 8, 10]
        int n = 1_000;
        List<int[]> triples = IntStream.rangeClosed(1, n).boxed().flatMap(i -> IntStream.rangeClosed(i, n)
                        .filter(j -> Math.sqrt(i * i + j * j) % 1 == 0)
                        .mapToObj(j -> new int[]{i, j, (int) Math.sqrt(i * i + j * j)}))
                .limit(10).toList();

        triples.forEach(e -> System.out.println(Arrays.toString(e)));
    }

}
