import java.util.*;

public class CountVowelsAndConsonantsWithStream {
    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Map<Long, Long> countVowelsAndConsonants(String str) {
        str = str.toLowerCase();
        long vowels  = str.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();

        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();

        return Map.of(vowels, consonants);

    }

}
