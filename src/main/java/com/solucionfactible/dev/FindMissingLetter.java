package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input
 * and that returns the missing letter in the array. You will always get an
 * valid array. And it will be always exactly one letter be missing. The length
 * of the array will always be at least 2.The array will always contain letters
 * in only one case. (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */

public class FindMissingLetter {

	public static char findMissingLetter(char[] array) {
		if (array.length >= 2) {
			char first = array[0]; // First letter.
			char last = array[array.length - 1]; // Last letter.
			short j = 0;

			for (char i = first; i <= last; i++) {
				if (i != array[j]) {
					return i;
				}
				j++;
			}
			return ' ';
		}
		return ' ';
	}
}
