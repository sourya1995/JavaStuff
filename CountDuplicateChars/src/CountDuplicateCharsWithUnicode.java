import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharsWithUnicode {
    public Map<String, Integer> CountDuplicateCharacters(String str) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            if(Character.charCount(cp) == 2) {
                i++;
            }
        result.compute(ch, (k,v) -> v == null ? 1 : v++);


        }
        return result;
    }
}
