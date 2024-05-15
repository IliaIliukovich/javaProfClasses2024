package lesson20240513;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Tasks {

    public static void main(String[] args) {
        // 1) создать любую дату
        // - вывести на консоль на русском / английском языках
        // - найти, на какой день недели она выпала
        // - вычесть 10 лет из созданной даты, вывести на консоль
        // - посчитать количество дней до нее
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2024, Month.SEPTEMBER, 1)));
        System.out.println(ChronoUnit.MINUTES.between(LocalDateTime.now(), LocalDateTime.of(2024, Month.SEPTEMBER, 1, 12, 0)));

        // 2) Найти дату последнего воскресенья сентября 2024 / второй среды мая 2024



    }


}
