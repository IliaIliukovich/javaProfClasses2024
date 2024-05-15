package lesson20240515;

import java.util.regex.Pattern;

public class Tasks {

    public static void main(String[] args) {

        // 1) Напишите регулярное выражение, которое соответствует пин-коду из 4 чисел.
        System.out.println(Pattern.matches("[0-9]{4}", "0000")); // 1 solution
        System.out.println(Pattern.matches("\\d{4}", "0000")); // 2 solution
        System.out.println(Pattern.matches("\\d\\d\\d\\d", "0000")); // 3 solution
        System.out.println(Pattern.matches("\\d\\d\\d\\d", "1234"));
        System.out.println(Pattern.matches("\\d\\d\\d\\d", "12345"));
        System.out.println(Pattern.matches("\\d\\d\\d\\d", "123-"));

        // 2) Напишите регулярное выражение, которое соответствует именам клавиш F1-F12.
        System.out.println("---F1_F12---");
        String fRegex = "F[1-9]|(F1[0-2])";
        System.out.println(Pattern.matches(fRegex, "F1"));
        System.out.println(Pattern.matches(fRegex, "F10"));
        System.out.println(Pattern.matches(fRegex, "F11"));
        System.out.println(Pattern.matches(fRegex, "F12"));
        System.out.println(Pattern.matches(fRegex, "F90"));
        System.out.println(Pattern.matches(fRegex, "F21"));
        System.out.println(Pattern.matches(fRegex, "F13"));

        // 3) Напишите регулярное выражение, которое соответствует URL-адресу сайта вида https://someaddress.someending
        System.out.println("Website");
        System.out.println(Pattern.matches("https://[a-z]+\\.[a-z]+", "https://someaddress.someending"));
        System.out.println(Pattern.matches("https://[a-z]+\\.[a-z]+", "https://some.address.someending"));
        System.out.println(Pattern.matches("https://[a-z]+\\.[a-z]+", "https://address.some1"));

    }



}
