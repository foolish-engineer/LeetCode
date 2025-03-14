package leetcode;

/**
 * @author mmcgarg
 * 
 *         link: https://leetcode.com/problems/palindrome-number/
 *
 */
public class Problem0009PalindromeNumber {

	public static boolean isPalindrome(int x) {
		boolean palindrome = false;

		long reverse = 0;
		int temp;
		int orginalInput = x;

		if (x < 0) {
			return false;
		}

		while (orginalInput > 0) {
			temp = orginalInput % 10;
			reverse = reverse * 10 + temp;
			orginalInput = orginalInput / 10;
		}

		if (x == reverse) {
			palindrome = true;
		}

		return palindrome;
	}
}
