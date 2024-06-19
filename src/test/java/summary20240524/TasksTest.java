package summary20240524;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static summary20240524.Tasks.findSecondMax;

public class TasksTest {

    @Test
    @Disabled
    public void findDublicates() {
        List<String> expected = Collections.emptyList();
        List<String> actual = Tasks.findDublicates(null);
        assertEquals(expected.toString(),actual.toString());

        expected = Collections.emptyList();
        actual = Tasks.findDublicates("");
        assertEquals(expected.toString(),actual.toString());

        expected = Collections.emptyList();
        actual = Tasks.findDublicates("Hello world! I love Java.");
        assertEquals(expected.toString(),actual.toString());

        expected = Arrays.asList("world");
        actual = Tasks.findDublicates("world world world");
        assertEquals(expected.toString(),actual.toString());

        expected = Arrays.asList("World, hello");
        actual = Tasks.findDublicates("Hello World world hello Hello");
        assertEquals(expected.toString(),actual.toString());
        expected = Arrays.asList("World, hello"); //?
        actual = Tasks.findDublicates("Hello World, world hello: Hello");
        assertEquals(expected.toString(),actual.toString());

        expected = Collections.emptyList();
        actual = Tasks.findDublicates("123456 123456");
        assertEquals(expected.toString(),actual.toString());

        expected = Arrays.asList("hello");
        actual = Tasks.findDublicates("Hello world1 world1 hello hello");
        assertEquals(expected.toString(),actual.toString());

    }

    @Test
    @Disabled
    void testfindSecondMax() {
        assertThrows(IllegalArgumentException.class, ()-> findSecondMax(null));
        int[]array={-10,-11};
        assertEquals(-11, findSecondMax(array));

        array=new int[]{1,2,3,3};
        assertEquals(3, findSecondMax(array));

        array=new int[]{1,1,1,1,1,1};
        assertEquals(1, findSecondMax(array));


        assertThrows(IllegalArgumentException.class, ()-> findSecondMax( new int[]{1}));
    }
}