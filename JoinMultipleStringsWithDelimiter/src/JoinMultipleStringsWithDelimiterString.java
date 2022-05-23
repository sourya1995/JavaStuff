import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinMultipleStringsWithDelimiterString {
    public static String joinMultipleStringsWithDelimiterString(char delimiter, String...args) {
        return Arrays.stream(args, 0, args.length)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }
}
