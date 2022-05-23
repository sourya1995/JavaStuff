public class CountOccurrencesOfACertainCharacterUsingStream {
    public static long countOccurrencesOfACertainCharacter(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
