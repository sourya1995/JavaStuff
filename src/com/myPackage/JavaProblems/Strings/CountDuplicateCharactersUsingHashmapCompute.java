package com.myPackage.JavaProblems.Strings;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharactersUsingHashmapCompute {

	public Map<Character, Integer> countDuplicateCharacters(String str) {

		Map<Character, Integer> result = new HashMap<>();
		for (char ch : str.toCharArray()) {
			char c = str.charAt(ch);
			result.compute(c, (k, v) -> (v == null) ? 1 : ++v); // atomically update a given value in a HashMap
		}
		return result;

	}
}

/* Here, we store the actual character as a key, and it's occurrence as a value. If the character was 
never added, we set the map as (character, 1). Else, we increment the occurrence count. */