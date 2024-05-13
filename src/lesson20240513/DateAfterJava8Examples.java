package lesson20240513;

import java.time.Duration;
import java.time.Instant;

public class DateAfterJava8Examples {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getNano());
        System.out.println(instant.getEpochSecond());

        Instant newInstant = instant.plusSeconds(100);
        System.out.println(newInstant);

    }

}
