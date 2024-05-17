package summary20240517;

import java.time.*;

public class FlightsTask {

    // Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени и длится 10 ч. 50 м.
    //Во сколько он прилетит? Написать метод, который мог бы совершать подобные вычисления.

    public static void main(String[] args) {
        LocalDateTime departureTime = LocalDateTime.of(2024, 5, 17, 15, 5);
        ZoneId departureZoneId = ZoneId.of("America/Los_Angeles");
        ZoneId arrivalZoneId = ZoneId.of("CET");
        Duration flightDuration = Duration.ofHours(10).plusMinutes(50);

        LocalDateTime arrivalTime = calculateArrivalTime(departureTime, flightDuration, departureZoneId, arrivalZoneId);
        System.out.println(arrivalTime);
    }

    public static LocalDateTime calculateArrivalTime(LocalDateTime departureTime, Duration flightDuration, ZoneId departureZoneId, ZoneId arrivalZoneId) {
        return ZonedDateTime.of(departureTime, departureZoneId).plus(flightDuration).withZoneSameInstant(arrivalZoneId).toLocalDateTime();
    }


}
