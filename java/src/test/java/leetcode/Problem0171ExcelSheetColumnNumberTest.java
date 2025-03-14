package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0171ExcelSheetColumnNumberTest {

	@Test
	public void titleToNumberTest() {
		int actual = Problem0171ExcelSheetColumnNumber.titleToNumber("A");

		assertEquals(actual, 1);
	}

	@Test
	public void titleToNumberTest2() {
		int actual = Problem0171ExcelSheetColumnNumber.titleToNumber("B");

		assertEquals(actual, 2);
	}

	@Test
	public void titleToNumberTest3() {
		int actual = Problem0171ExcelSheetColumnNumber.titleToNumber("AB");

		assertEquals(actual, 28);
	}

	@Test
	public void titleToNumberTest4() {
		int actual = Problem0171ExcelSheetColumnNumber.titleToNumber("ZY");

		assertEquals(actual, 701);
	}

	@Test
	public void titleToNumberTest5() {
		int actual = Problem0171ExcelSheetColumnNumber.titleToNumber("AAA");

		assertEquals(actual, 703);
	}
}
