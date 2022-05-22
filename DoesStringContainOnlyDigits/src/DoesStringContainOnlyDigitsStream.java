public class DoesStringContainOnlyDigitsStream {
    public static boolean ContainsOnlyDigits(String str) {
        return !str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }
}
