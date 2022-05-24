import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrencesInAString {
    public static int countStringInString(String string, String toFind) {
        int position = 0;
        int count = 0;
        int n = toFind.length();

        while((position = string.indexOf(toFind, position)) != -1) {
            position = position + n;
            count++;
        }
        return count;
    }

    public static int countStringInStringUsingRegex(String string, String toFind) {
        Pattern pattern = Pattern.compile(Pattern.quote(toFind));
        Matcher matcher = pattern.matcher(string);

        int position = 0;
        int count = 0;

        while(matcher.find(position)) {
            position = matcher.start() + 1;
            count++;
        }
        return count;
    }
}
