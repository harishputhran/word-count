package com.clean.code;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class WordCountCalculatorShould {
	
	private WordCountCalculator wordCountCalculator;
	private Map<String, Integer> expectedUniqueWordsCount;
	
	@Before
	public void setUp(){
		wordCountCalculator = new WordCountCalculator();
		expectedUniqueWordsCount = new HashMap<>();
	}

	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_is_One_Word(){
		String helloText = "Hello";
		expectedUniqueWordsCount.put(helloText, 1);
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords(helloText));		
	}
	
	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_Word_is_Space_Delimited_Text_consisting_of_2_Words(){
		expectedUniqueWordsCount.put("Hello", 1);
		expectedUniqueWordsCount.put("World", 1);
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords("Hello World"));
	}
}
