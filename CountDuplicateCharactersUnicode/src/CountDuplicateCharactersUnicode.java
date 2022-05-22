import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharactersUnicode {
    public Map<String, Integer> countDuplicateCharactersUnicode(String str) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp)); //convert to character, then to String
            if(Character.charCount(cp) == 2) {
                i++;
            }

            result.compute(ch, (k, v) -> v==null ? 1 : v++);
        }
        return result;
    }
}
