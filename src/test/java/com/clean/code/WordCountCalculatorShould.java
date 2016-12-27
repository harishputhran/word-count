package com.clean.code;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountCalculatorShould {

	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_is_One_Word(){
		WordCountCalculator wordCountCalculator = new WordCountCalculator();
		Map<String, Integer> expectedUniqueWordsAndItsCount = new HashMap<>();
		String helloText = "Hello";
		expectedUniqueWordsAndItsCount.put(helloText, 1);
		assertEquals(expectedUniqueWordsAndItsCount, wordCountCalculator.countUniqueWords(helloText));		
	}
	
	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_Word_is_Space_Delimited_Text_consisting_of_2_Words(){
		WordCountCalculator wordCountCalculator = new WordCountCalculator();
		Map<String, Integer> expectedUniqueWordsAndItsCount = new HashMap<>();
		expectedUniqueWordsAndItsCount.put("Hello", 1);
		expectedUniqueWordsAndItsCount.put("World", 1);
		assertEquals(expectedUniqueWordsAndItsCount, wordCountCalculator.countUniqueWords("Hello World"));
	}
}
