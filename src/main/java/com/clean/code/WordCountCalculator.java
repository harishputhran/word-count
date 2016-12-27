package com.clean.code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountCalculator {
	
	public Map<String, Long> countUniqueWords(String inputWord) {
		String SPACE_DELIMITER = " ";
		String[] words = inputWord.split(SPACE_DELIMITER);
		return Arrays.asList(words)
	                 .stream()
		             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	}
}
