import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharactersUnicodeStream {
    public Map<String, Long> countDuplicateCharactersUnicodeStream(String str) {
        Map<String, Long> result = str.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result;
    }
}
