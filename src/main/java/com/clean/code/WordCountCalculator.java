package com.clean.code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountCalculator {
	
	private final String SPACE_DELIMITER = " ";
	
	public Map<String, Long> countUniqueWords(String inputText) {		
		String[] words = getWordsFromDelimitedText(inputText, SPACE_DELIMITER);
		return getWordCount(words);
	}
	
	protected String[] getWordsFromDelimitedText(String text, String delimiter) {
		return text.split(delimiter);
	}

	protected Map<String, Long> getWordCount(String[] words) {
		return Arrays.asList(words)
	                 .stream()
		             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}	
}
