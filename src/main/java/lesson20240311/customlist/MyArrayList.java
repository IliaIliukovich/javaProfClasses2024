package lesson20240311.customlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList implements Iterable<String> { // custom static array list example

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

            @Override
            public boolean hasNext() {
                return currentIndex < data.length;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No elements present");
                }
                return data[currentIndex++];
            }
        };
    }

    public Iterator<String> reverseIterator() {
        return new MyArrayListReverseIterator();
    }



    public class MyArrayListReverseIterator implements Iterator<String>{
        int currentIndex = data.length - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No elements present");
            }
            return data[currentIndex--];
        }
    }

}
