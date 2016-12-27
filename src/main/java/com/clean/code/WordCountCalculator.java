package com.clean.code;

import java.util.HashMap;
import java.util.Map;

public class WordCountCalculator {
	
	public Map<String, Integer> countUniqueWords(String inputWord) {
		Map<String, Integer> wordAndCount = new HashMap<>();
		String SPACE_DELIMITER = " ";
		if(inputWord.contains(SPACE_DELIMITER)){
			String[] words = inputWord.split(SPACE_DELIMITER);
			wordAndCount.put(words[0], 1);
			wordAndCount.put(words[1], 1);
		}else{
			wordAndCount.put(inputWord, 1);
		}		
		return wordAndCount;
	}
}
