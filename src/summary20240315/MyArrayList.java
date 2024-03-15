package summary20240315;

import java.util.*;

public class MyArrayList implements Iterable<String> {

    private String[] data;

    public MyArrayList(String[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            int currentIndex = 0;
            String[] copy;

            {
                copy = Arrays.copyOf(data, data.length);
                shuffle(copy);
            }

            @Override
            public boolean hasNext() {
                return currentIndex < data.length;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No elements present");
                }
                return copy[currentIndex++];
            }
        };
    }

    public static void shuffle(String[] data) {
        Random random = new Random();
        for (int i = 1; i < data.length; i++) {
            int j = random.nextInt(i + 1);
            String tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }


    public static void main(String[] args) {
        String[] data = new String[]{"A", "B", "C", "D", "E"};
        MyArrayList myArrayList = new MyArrayList(data);

        Iterator<String> iterator1 = myArrayList.iterator();
        Iterator<String> iterator2 = myArrayList.iterator();
        System.out.println(iterator1.next());
        System.err.println(iterator2.next());
        System.out.println(iterator1.next());
        System.err.println(iterator2.next());
        System.out.println(iterator1.next());
        System.err.println(iterator2.next());
        System.out.println(iterator1.next());
        System.err.println(iterator2.next());
        System.out.println(iterator1.next());
        System.err.println(iterator2.next());

        iterator1 = null;
        iterator2 = null;
    }

}
