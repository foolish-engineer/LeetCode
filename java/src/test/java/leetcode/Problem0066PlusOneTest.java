package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0066PlusOneTest {

	@Test
	public void plusOneTest() {
		int[] digits = { 0 };
		int[] actual = Problem0066PlusOne.plusOne(digits);

		assertEquals(actual[0], 1);
	}

	@Test
	public void plusOneTest1() {
		int[] digits = { 1 };
		int[] actual = Problem0066PlusOne.plusOne(digits);

		assertEquals(actual[0], 2);
	}

	@Test
	public void plusOneTest2() {
		int[] digits = { 9 };
		int[] actual = Problem0066PlusOne.plusOne(digits);

		assertEquals(actual.length, 2);
		assertEquals(actual[0], 1);
		assertEquals(actual[1], 0);
	}

	@Test
	public void plusOneTest3() {
		int[] digits = { 1, 2, 3 };
		int[] actual = Problem0066PlusOne.plusOne(digits);

		assertEquals(actual.length, 3);
		assertEquals(actual[2], 4);
	}

	@Test
	public void plusOneTest4() {
		int[] digits = { 4, 3, 2, 1 };
		int[] actual = Problem0066PlusOne.plusOne(digits);

		assertEquals(actual.length, 4);
		assertEquals(actual[3], 2);
	}

	@Test
	public void plusOneTest5() {
		int[] digits = { 9, 9, 9, 9 };
		int[] actual = Problem0066PlusOne.plusOne(digits);

		assertEquals(actual.length, 5);
		assertEquals(actual[0], 1);
	}

	@Test
	public void plusOneTest6() {
		int[] digits = { 9, 9, 9, 5 };
		int[] actual = Problem0066PlusOne.plusOne(digits);

		assertEquals(actual.length, 4);
		assertEquals(actual[0], 9);
	}

	@Test
	public void plusOneTest7() {
		int[] digits = { 2, 4, 9, 3, 9 };
		int[] actual = Problem0066PlusOne.plusOne(digits);

		assertEquals(actual.length, 5);
		assertEquals(actual[0], 2);
	}
}
