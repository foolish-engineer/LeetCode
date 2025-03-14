package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0020ValidParenthesesTest {

	@Test
	public void isValidTest() {
		boolean valid = Problem0020ValidParentheses.isValid("()");

		assertEquals(valid, true);
	}

	@Test
	public void isValidTest2() {
		boolean valid = Problem0020ValidParentheses.isValid("()[]{}");

		assertEquals(valid, true);
	}

	@Test
	public void isValidTest3() {
		boolean valid = Problem0020ValidParentheses.isValid("(]");

		assertEquals(valid, false);
	}

	@Test
	public void isValidTest4() {
		boolean valid = Problem0020ValidParentheses.isValid("([)]");

		assertEquals(valid, false);
	}

	@Test
	public void isValidTest5() {
		boolean valid = Problem0020ValidParentheses.isValid("{[]}");

		assertEquals(valid, true);
	}
}
