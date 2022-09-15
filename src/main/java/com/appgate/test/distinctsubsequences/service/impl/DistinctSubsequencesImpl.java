package com.appgate.test.distinctsubsequences.service.impl;

import org.springframework.stereotype.Service;

import com.appgate.test.distinctsubsequences.service.DistinctSubsequences;

@Service
public class DistinctSubsequencesImpl implements DistinctSubsequences {

	@Override
	public int getAmountDistinctSubSequences(String key, String textToSearch) {

		int sizeKey = key.length();
		int sizeTextToSearch = textToSearch.length();

		int[][] table = new int[sizeTextToSearch + 1][sizeKey + 1];

		for (int i = 0; i < sizeTextToSearch; i++)
			table[i][0] = 0;

		for (int i = 0; i < sizeKey; i++)
			table[0][i] = 1;

		for (int row = 1; row <= sizeTextToSearch; row++) {
			for (int column = 1; column <= sizeKey; column++) {
				if (textToSearch.charAt(row - 1) != key.charAt(column - 1)) {
					table[row][column] = table[row][column - 1];
				} else {
					table[row][column] = table[row][column - 1] + table[row - 1][column - 1];
				}
			}
		}

		return table[sizeTextToSearch][sizeKey];
	}
}
