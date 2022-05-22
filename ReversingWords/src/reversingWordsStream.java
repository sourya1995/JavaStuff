import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class reversingWordsStream {
    private static final Pattern PATTERN = Pattern.compile(" +");

    public static String reversedWords(String str) {
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining());
    }
}
