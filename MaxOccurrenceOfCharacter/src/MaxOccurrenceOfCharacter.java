import java.util.Collections;
import java.util.Map;

public class MaxOccurrenceOfCharacter {
	public static Pair<Character, Integer> maxOccurrenceCharacter(String str){
		Map<Character, Integer> counter = new HashMap<>();
		char[] chStr  = str.toCharArray();
		
		for(int i = 0; i < str.length(); i++) {
			char currentCh = chStr[i];
			if(!Character.isWhitespace(currentCh)) {
				Integer ChNumber = counter.get(currentCh);
				if(ChNumber == null) {
					counter.put(currentCh, 1);
				} else {
					counter.put(currentCh, ChNumber);
				}
			}
		}
		
		int maxOccurrences = Collections.max(counter.values());
		char maxCharacter = Character.MIN_VALUE;
		
		for(Entry<Character, Integer> entry: counter.entrySet()) {
			if(entry.getValue() == maxOccurrences) {
				maxCharacter = entry.getKey();
			}
		}
		
		return Pair.of(maxCharacter, maxOccurrences);
		
	}
	

}


