package com.myPackage.JavaProblems.Strings;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharactersUsingStreams {
	
	public Map<Character, Long> countDuplicateCharacters(String str){
		Map<Character, Long> result = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		return result;
				
	}

}

/* 1 - str.chars() generates an IntStream
 * 2 - mapToObj() generates a stream of characters
 * 3 - Collectors.groupingby() groups the characters
 * 4 - Collectors.counting() counts them
 * 
 */
