import java.util.Arrays;
import java.util.Comparator;

public class SortingAnArrayOfStringsByLength {
    public static void sortArrayOfStringsByLength(String [] str, Sort direction) {
        if(direction.equals(Sort.ASC)) {
            return Arrays.stream(str)
                    .sorted(Comparator.comparingInt(String::length))
                    .toArray(String[]::new);
        } else {
            return Arrays.stream(str)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .toArray(String[]::new);
        }
    }
}
