
public class MaxOccurrenceOfCharacterStream {
	public static Pair<Character, Long> maxOccurrenceOfCharacter(String str) {
		return str.chars()
				.filter(c -> Character.isWhitespace(c) == false)
				.mapToObj(c -> (char) c)
				.collect(groupingBy(c -> c, counting))
				.entrySet()
				.stream()
				.max(comparingByValue())
				.map(p -> Pair.of(p.getKey(, p.getValue())))
				.orElse(Pair.of(Character.MIN_VALUE, -1L));
	}

}
