import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChars {
    public Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>(); //storing our results here
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //store each character at a specific instance
            result.compute(ch, (k,v) -> (v == null) ? 1 : ++v); //take our HashMap, add each char as a key. For each key, add a value. If null, put 1, else increase the count
        }
        return result;
    }
}
