package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0067AddBinaryTest {

	@Test
	public void addBinaryTest() {
		String actual = Problem0067AddBinary.addBinary("11", "1");
		assertEquals(actual, "100");
	}

	@Test
	public void addBinaryTest2() {
		String actual = Problem0067AddBinary.addBinary("1010", "1011");
		assertEquals(actual, "10101");
	}

	@Test
	public void addBinaryTest3() {
		String actual = Problem0067AddBinary.addBinary("11", "11");
		assertEquals(actual, "110");
	}

	@Test
	public void addBinaryTest4() {
		String actual = Problem0067AddBinary.addBinary("111", "1");
		assertEquals(actual, "1000");
	}

	@Test
	public void addBinaryTest5() {
		String actual = Problem0067AddBinary.addBinary("0", "0");
		assertEquals(actual, "0");
	}

	@Test
	public void addBinaryTest6() {
		String actual = Problem0067AddBinary.addBinary("100", "100");
		assertEquals(actual, "1000");
	}

	@Test
	public void addBinaryTest7() {
		String actual = Problem0067AddBinary.addBinary("10100", "10100");
		assertEquals(actual, "101000");
	}

	@Test
	public void addBinaryTest8() {
		String actual = Problem0067AddBinary.addBinary("10100", "0");
		assertEquals(actual, "10100");
	}

	@Test
	public void addBinaryTest9() {
		String actual = Problem0067AddBinary.addBinary("110010", "10111");
		assertEquals(actual, "1001001");
	}

	@Test
	public void addBinaryTest10() {
		String actual = Problem0067AddBinary.addBinary("0", "10100");
		assertEquals(actual, "10100");
	}
	
	@Test
	public void addBinaryTest11() {
		String actual = Problem0067AddBinary.addBinary("10", "0");
		assertEquals(actual, "10");
	}
}
