import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharsWithStreamsUnicode {
    public Map<String, Long> CountDuplicateCharacters(String str) {
        Map<String, Long> result = str.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }


}
