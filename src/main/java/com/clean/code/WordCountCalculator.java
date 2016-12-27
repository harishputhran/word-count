package com.clean.code;

import java.util.HashMap;
import java.util.Map;

public class WordCountCalculator {
	
	public Map<String, Integer> countUniqueWords(String inputWord) {
		Map<String, Integer> wordsCount = new HashMap<>();
		String SPACE_DELIMITER = " ";
		String[] words = inputWord.split(SPACE_DELIMITER);
		for(String word : words){
			if(wordsCount.containsKey(word)){
				Integer countForWord = wordsCount.get(word);
				wordsCount.put(word, countForWord + 1);
			}else{
				wordsCount.put(word, 1);
			}
		}
		return wordsCount;
	}
}
