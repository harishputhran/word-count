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
	private final String BLANK_SPACE_DELIMITER = " ";
	private final String COMMA_DELIMITER = ",";
	
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
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords(HELLO_TEXT, BLANK_SPACE_DELIMITER));		
	}
	
	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_Word_is_Space_Delimited_Text_consisting_of_2_Words(){
		expectedUniqueWordsCount.put(HELLO_TEXT, WORD_COUNT_1);
		expectedUniqueWordsCount.put("World", WORD_COUNT_1);
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords("Hello World", BLANK_SPACE_DELIMITER));
	}
	
	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_Word_is_Space_Delimited_Text_consisting_of_2_Identical_Words(){
		expectedUniqueWordsCount.put(HELLO_TEXT, WORD_COUNT_2);
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords("Hello Hello", BLANK_SPACE_DELIMITER));
	}
	
	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_Word_is_Comma_Delimited_Text_consisting_of_2_Identical_Words(){		
		expectedUniqueWordsCount.put(HELLO_TEXT, WORD_COUNT_2);
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords("Hello,Hello", COMMA_DELIMITER));
	}
	
	@Test
	public void return_map_of_Unique_Words_and_its_Count_When_Input_Word_is_Space_Delimited_Text_consisting_of_Multiple_Words(){		
		expectedUniqueWordsCount.put("a", WORD_COUNT_2);
		expectedUniqueWordsCount.put("test", WORD_COUNT_1);
		expectedUniqueWordsCount.put("for", WORD_COUNT_1);
		expectedUniqueWordsCount.put("word count", WORD_COUNT_1);
		assertEquals(expectedUniqueWordsCount, wordCountCalculator.countUniqueWords("a,test,for,a,word count", COMMA_DELIMITER));
	}
}
