package lesson20240228;

import java.util.Arrays;

public class UseSeasons {

    public static void main(String[] args) {
        Season season = Season.SPRING;

        System.out.println(season);
        System.out.println(season.ordinal());
        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));
        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer);

        printSeasonMessage(season);

        String message = getSeasonMessage(season);
        System.out.println(message);
    }

    public static String getSeasonMessage(Season season) {
        String message = switch (season) {
            case AUTUMN -> {
                yield "Autumn message";
            }
            case SPRING -> "Spring message";
            case SUMMER -> "Summer message";
            case WINTER -> "Winter message";
        };
        return message;
    }

    public static void printSeasonMessage(Season season) {
        switch (season){
            case WINTER ->
                    System.out.println("It's cold winter");
            case SPRING ->
                    System.out.println("Spring is coming. Flowers are blooming");
            case AUTUMN ->
                    System.out.println("It's rainy autumn");
            default ->
                    System.out.println("Summer is the best season of year");
        }

//        switch (season){
//            case WINTER:
//                System.out.println("It's cold winter");
//                break;
//            case SPRING:
//                System.out.println("Spring is coming. Flowers are blooming");
//                break;
//            case AUTUMN:
//                System.out.println("It's rainy autumn");
//                break;
//            default:
//                System.out.println("Summer is the best season of year");
//                break;
//        }
    }


}
