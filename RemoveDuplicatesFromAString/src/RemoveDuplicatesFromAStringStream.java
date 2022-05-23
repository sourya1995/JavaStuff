import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromAStringStream {
    public static String removeDuplicates(String str) {
        return Arrays.asList(str.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
