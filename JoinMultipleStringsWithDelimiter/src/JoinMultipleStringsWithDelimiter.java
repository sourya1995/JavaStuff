import java.util.StringJoiner;

public class JoinMultipleStringsWithDelimiter {
    public static String joinByDelimiter(char delimiter, String...args ) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (i = 0; i < args.length - 1; i++) {
            result.append(args[i]).append(delimiter);
        }
        result.append(args[i]);
        return result.toString();
    }

    public static String joinByDelimiterV2(char delimiter, String...args) {
        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for(String arg : args) {
            joiner.add(arg);
        }

        return joiner.toString();
    }
}
