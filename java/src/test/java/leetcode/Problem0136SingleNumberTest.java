package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0136SingleNumberTest {

	@Test
	public void singleNumberTest() {
		int actual = Problem0136SingleNumber.singleNumber(new int[] { 1 });

		assertEquals(actual, 1);
	}

	@Test
	public void singleNumberTest2() {
		int actual = Problem0136SingleNumber.singleNumber(new int[] { 1, 2, 2 });

		assertEquals(actual, 1);
	}

	@Test
	public void singleNumberTest3() {
		int actual = Problem0136SingleNumber.singleNumber(new int[] { 4, 1, 2, 1, 2 });

		assertEquals(actual, 4);
	}

	@Test
	public void singleNumberTest4() {
		int actual = Problem0136SingleNumber.singleNumber(new int[] { 2, 2, 1 });

		assertEquals(actual, 1);
	}

	@Test
	public void singleNumberTest5() {
		int actual = Problem0136SingleNumber
				.singleNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8 });

		assertEquals(actual, 9);
	}
}
