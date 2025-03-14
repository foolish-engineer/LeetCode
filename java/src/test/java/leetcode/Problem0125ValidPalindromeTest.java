package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Problem0125ValidPalindromeTest {

	@Test
	public void isPalindromeTest() {
		boolean actual = Problem0125ValidPalindrome.isPalindrome("");

		assertTrue(actual);
	}

	@Test
	public void isPalindromeTest2() {
		boolean actual = Problem0125ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama");

		assertTrue(actual);
	}

	@Test
	public void isPalindromeTest3() {
		boolean actual = Problem0125ValidPalindrome.isPalindrome("race a car");

		assertFalse(actual);
	}

	@Test
	public void isPalindromeTest4() {
		boolean actual = Problem0125ValidPalindrome.isPalindrome("mMmM");

		assertTrue(actual);
	}

	@Test
	public void isPalindromeTest5() {
		boolean actual = Problem0125ValidPalindrome.isPalindrome("MnMnM");

		assertTrue(actual);
	}
}
