import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class RemoveDuplicatesFromAString {
    public static String removeDuplicates(String str) {
            char [] chArray = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            Set<Character> chHashSet = new HashSet<>();

            for (char c : chArray) {
                if(chHashSet.add(c)) {
                    sb.append(c);
                }
            }
            return sb.toString();
    }

    public static String removeDuplicatesv2(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chArray.length; i++) {
            if(sb.indexOf(String.valueOf(i)) == -1){
                sb.append(i);
            }

        }
        return sb.toString();
    }
}
