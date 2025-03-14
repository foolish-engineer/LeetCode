package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0007ReverseIntegerTest {

	@Test
	public void reverseTest() {
		int reverse = Problem0007ReverseInteger.reverse(123);

		assertEquals(reverse, 321);

		reverse = Problem0007ReverseInteger.reverse(2147483647);

		assertEquals(reverse, 0);

		reverse = Problem0007ReverseInteger.reverse(-2147483648);

		assertEquals(reverse, 0);
	}
}
