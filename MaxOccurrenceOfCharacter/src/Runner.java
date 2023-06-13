
public class Runner {
	public static void main(String[] args) {
		String testString  = "I like boobs";
		MaxOccurrenceOfCharacter test = new MaxOccurrenceOfCharacter();
		Pair<Character, Integer> testValue = test.maxOccurrenceCharacter(testString);
		System.out.println(testValue);
	}

}
