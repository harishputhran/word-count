package com.clean.code;

import static org.junit.Assert.assertEquals;
import static java.lang.Long.valueOf;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class WordCountCalculatorShould {
	
	private final Long WORD_COUNT_2 = valueOf(2);
	private final Long WORD_COUNT_1 = valueOf(1);
	private final String HELLO_TEXT = "Hello";
	
	private WordCountCalculator wordCountCalculator;
	private Map<String, Long> expectedUniqueWordsCount;
	
	@Before
	public void setUp(){
		wordCountCalculator = new WordCountCalculator();
		expectedUniqueWordsCount = new HashMap<>();
	}

	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_is_One_Word(){
		expectedUniqueWordsCount.put(HELLO_TEXT, WORD_COUNT_1);
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords(HELLO_TEXT));		
	}
	
	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_Word_is_Space_Delimited_Text_consisting_of_2_Words(){
		expectedUniqueWordsCount.put(HELLO_TEXT, WORD_COUNT_1);
		expectedUniqueWordsCount.put("World", WORD_COUNT_1);
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords("Hello World"));
	}
	
	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_Word_is_Space_Delimited_Text_consisting_of_2_Identical_Words(){
		expectedUniqueWordsCount.put(HELLO_TEXT, WORD_COUNT_2);
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords("Hello Hello"));
	}
	
	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_Word_is_Comma_Delimited_Text_consisting_of_2_Identical_Words(){		
		expectedUniqueWordsCount.put(HELLO_TEXT, valueOf(2));
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords("Hello,Hello"));
	}
}
