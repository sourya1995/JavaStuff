import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharactersWithStream {
    public Map<Character, Long> countDuplicateCharactersWithStream(String str) {
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c , Collectors.counting()));

        return result;
    }
}
