package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative
 * persistence, which is the number of times you must multiply the digits in num
 * until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {

	public static long persistence(long num) {
		if (num <= 9) {
			return 0;
		}

		long count = 0;
		while (num > 9) {
			long factor = 1;
			while (num != 0) {
				factor *= (num % 10);
				num /= 10;
			}
			num = factor;
			count++;
		}
		return count;
	}

}
