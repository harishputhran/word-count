package com.clean.code;

import java.util.HashMap;
import java.util.Map;

public class WordCountCalculator {
	
	public Map<String, Integer> countUniqueWords(String inputWord) {
		Map<String, Integer> wordAndCount = new HashMap<>();
		wordAndCount.put(inputWord, 1);
		return wordAndCount;

	}
}
