package com.clean.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordCountCalculatorShould {

	@Test
	public void return_One_as_Count_of_Unique_Words_When_Input_is_One_Word(){
		WordCountCalculator wordCountCalculator = new WordCountCalculator();
		assertEquals(1, wordCountCalculator.countUniqueWords("Hello"));		
	}
}
