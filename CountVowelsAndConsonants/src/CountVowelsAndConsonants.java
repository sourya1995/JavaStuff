import java.util.*;


public class CountVowelsAndConsonants {
    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public  static Map<Integer, Integer> countVowelsAndConsonants(String str) {
        Map<Integer, Integer> result = new HashMap<>();
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (allVowels.contains(ch)) {
                vowels++;
            } else if ( ch >= 'a' && ch <= 'z') {
                consonants++;
            }

            result.put(vowels, consonants);

        }

        return result;
    }
}
