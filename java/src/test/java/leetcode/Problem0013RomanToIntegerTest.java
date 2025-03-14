package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0013RomanToIntegerTest {

	@Test
	public void romanToIntTest() {
		int romanToInt = Problem0013RomanToInteger.romanToInt("III");

		assertEquals(romanToInt, 3);
	}

	@Test
	public void romanToIntTest2() {
		int romanToInt = Problem0013RomanToInteger.romanToInt("IV");

		assertEquals(romanToInt, 4);
	}

	@Test
	public void romanToIntTest3() {
		int romanToInt = Problem0013RomanToInteger.romanToInt("IX");

		assertEquals(romanToInt, 9);
	}

	@Test
	public void romanToIntTest4() {
		int romanToInt = Problem0013RomanToInteger.romanToInt("LVIII");

		assertEquals(romanToInt, 58);
	}

	@Test
	public void romanToIntTest5() {
		int romanToInt = Problem0013RomanToInteger.romanToInt("MCMXCIV");

		assertEquals(romanToInt, 1994);
	}
}
