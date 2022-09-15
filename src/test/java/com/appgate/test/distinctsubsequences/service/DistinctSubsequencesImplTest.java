package com.appgate.test.distinctsubsequences.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import com.appgate.test.distinctsubsequences.service.impl.DistinctSubsequencesImpl;

class DistinctSubsequencesImplTest {

	@InjectMocks
	DistinctSubsequencesImpl distinctSubsequencesImpl = new DistinctSubsequencesImpl();

	@Test
	void getAmountDistinctSubSequencesOneTest() {
		String key = "ABCDE";
		String textToSearch = "ACE";
		int actual = distinctSubsequencesImpl.getAmountDistinctSubSequences(key, textToSearch);
		assertEquals(1, actual);
	}

	@Test
	void getAmountDistinctSubSequencesTwoTest() {
		String key = "rabbbit";
		String textToSearch = "rabbit";
		int actual = distinctSubsequencesImpl.getAmountDistinctSubSequences(key, textToSearch);
		assertEquals(3, actual);
	}
	
	@Test
	void getAmountDistinctSubSequencesThirdTest() {
		String key = "babgbag";
		String textToSearch = "bag";
		int actual = distinctSubsequencesImpl.getAmountDistinctSubSequences(key, textToSearch);
		assertEquals(5, actual);
	}
	
	@Test
	void getAmountDistinctSubSequencesFourTest() {
		String key = "ABCDE";
		String textToSearch = "AEC";
		int actual = distinctSubsequencesImpl.getAmountDistinctSubSequences(key, textToSearch);
		assertEquals(0, actual);
	}
}
