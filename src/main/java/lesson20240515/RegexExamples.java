package lesson20240515;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

    public static void main(String[] args) {
        String text = "words";
        String regex = "word."; // любой отдельный символ, кроме новой строки

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();
        System.out.println(matches);

        System.out.println(Pattern.matches("word\\.", "words")); // точка
        System.out.println(Pattern.matches("[ws]ords", "words")); // w или s
        System.out.println(Pattern.matches("[ws?]ords", "sords")); // w или s или ?
        System.out.println(Pattern.matches("[ws?]ords", "?ords"));
        System.out.println(Pattern.matches("[ws?]ord[a-e]", "wordc")); // от a до e
        System.out.println(Pattern.matches("word[1-2][0-5]", "word16"));
        System.out.println(Pattern.matches("word[^-?!]", "word&")); // все, кроме - ? !

        System.out.println("Quantifiers - ? * + {}");
        System.out.println(Pattern.matches("word[-?!]{3}", "word!!?")); // - ? ! трижды
        System.out.println(Pattern.matches("word[-?!]?", "word")); // один раз или ни разу
        System.out.println(Pattern.matches("word[-?!]?", "word!"));
        System.out.println(Pattern.matches("word[-?!]*", "word")); // ноль или более раз
        System.out.println(Pattern.matches("word[-?!]*", "word!"));
        System.out.println(Pattern.matches("word[-?!]*", "word!!!!!!!"));
        System.out.println(Pattern.matches("word[-?!]+", "word!")); // один или более раз
        System.out.println(Pattern.matches("word[-?!]+", "word"));

        // word words
        System.out.println(Pattern.matches("word[s]?", "words"));
        System.out.println(Pattern.matches("word[s]?", "word"));

        System.out.println(Pattern.matches("[\\w]{5}", "words"));
        System.out.println(Pattern.matches("[\\w]{5}", "12345"));
        System.out.println(Pattern.matches("[\\s]{5}", "    \n"));

        System.out.println(Pattern.matches("(cat)|(dog)", "cat"));
        System.out.println(Pattern.matches("(cat)&(dog)", "dog"));

        String someText = "text";
        System.out.println(someText.matches("tex."));


        if (condition1() || condition2())
            System.out.println("condition1() || condition2()");
        if (condition1() | condition2())
            System.out.println("condition1() | condition2()");
//        if (condition1() && condition2())
//            System.out.println("condition1() && condition2()");
//        if (condition1() & condition2())
//            System.out.println("condition1() & condition2()");

    }

    private static boolean condition1() {
        System.out.println("condition1 invoked");
        return true;
    }

    private static boolean condition2() {
        System.out.println("condition2 invoked");
        return false;
    }




}
