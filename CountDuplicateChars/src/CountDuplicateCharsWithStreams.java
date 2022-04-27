import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


/*
*
* First, take a string
* Convert it to an IntStream by str.chars()
* Convert IntStream to stream of characters by calling mapToobj and casting
* Call collectors.groupingBy and count */
public class CountDuplicateCharsWithStreams {
    public Map<Character, Long> CountDuplicateCharacters(String str) {
        Map<Character, Long> result = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }

}
