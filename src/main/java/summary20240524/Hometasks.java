package summary20240524;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hometasks {

    public static void main(String[] args) {
        // Напишите метод поиска в тексте всех слов, начинающихся с определенной буквы.
        String text = "To be or not to\n be. \nThat is a question. trust\n";
        char letter = 't';
        List<String> words = findWordsStartingWith(text, letter);
        words.forEach(System.out::println);

    }

    public static List<String> findWordsStartingWith(String text, char letter) {
        String regex = "\\b[" + letter + "][a-zA-Z]*\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.results().map(MatchResult::group).toList();
    }


}
