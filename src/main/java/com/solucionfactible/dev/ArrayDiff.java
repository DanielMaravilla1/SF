package com.solucionfactible.dev;

/**
 * diff subtracts one list from another and returns the result. It should remove
 * all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {

	public static int[] diff(int[] a, int[] b) {
		int newSize = 0;
		for (int value : a) {
			if (!contains(b, value)) {
				newSize++;
			}
		}

		int[] result = new int[newSize];
		int position = 0;
		for (int value : a) {
			if (!contains(b, value)) {
				result[position] = value;
				position++;
			}
		}
		return result;

	}

	public static boolean contains(int[] arr, int num) {
		for (int value : arr) {
			if (value == num) {
				return true;
			}
		}
		return false;
	}

}
