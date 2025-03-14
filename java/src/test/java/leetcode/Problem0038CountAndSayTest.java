package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0038CountAndSayTest {

	@Test
	public void countAndSayTest() {
		String actual = Problem0038CountAndSay.countAndSay(0);

		assertEquals(actual, "");
	}

	@Test
	public void countAndSayTest2() {
		String actual = Problem0038CountAndSay.countAndSay(1);

		assertEquals(actual, "1");
	}

	@Test
	public void countAndSayTest3() {
		String actual = Problem0038CountAndSay.countAndSay(2);

		assertEquals(actual, "11");
	}

	@Test
	public void countAndSayTest4() {
		String actual = Problem0038CountAndSay.countAndSay(3);

		assertEquals(actual, "21");
	}

	@Test
	public void countAndSayTest5() {
		String actual = Problem0038CountAndSay.countAndSay(4);

		assertEquals(actual, "1211");
	}

	@Test
	public void countAndSayTest6() {
		String actual = Problem0038CountAndSay.countAndSay(5);

		assertEquals(actual, "111221");
	}

	@Test
	public void countAndSayTest7() {
		String actual = Problem0038CountAndSay.countAndSay(6);

		assertEquals(actual, "312211");
	}
}
