/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author mmcgarg
 *
 */
public class Problem0345ReverseVowelsofaString {

	// hello
	// abcd
	// aieou
	// babebibobu
	// empty
	// a
	// b
	// aA
	// Aa
	// AIEOU
	// BABEBIBOBU
	// HeLlO
	public String reverseVowels(String s) {
		int low = 0;
		int high = s.length() - 1;

		char[] cArray = s.toCharArray();
		List<Character> vList = Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' });

		int swapLow = -1;
		int swapHigh = -1;

		while (low < high) {
			if (vList.contains(cArray[low])) {
				swapLow = low;
			} else {
				low++;
				continue;
			}

			if (vList.contains(cArray[high])) {
				swapHigh = high;
			} else {
				high--;
				continue;
			}

			if (swapHigh != -1 && swapLow != -1) {
				char temp = cArray[swapHigh];
				cArray[swapHigh] = cArray[swapLow];
				cArray[swapLow] = temp;
				swapHigh = -1;
				swapLow = -1;
				high--;
				low++;
			}
		}

		return new String(cArray);
	}
}
