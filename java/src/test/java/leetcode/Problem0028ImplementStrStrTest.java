package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0028ImplementStrStrTest {

	@Test
	public void strStrTest() {
		int actual = Problem0028ImplementStrStr.strStr("hello", "ll");
		assertEquals(actual, 2);
	}

	@Test
	public void strStrTest2() {
		int actual = Problem0028ImplementStrStr.strStr("aaaaa", "bba");
		assertEquals(actual, -1);
	}

	@Test
	public void strStrTest3() {
		int actual = Problem0028ImplementStrStr.strStr("", "");
		assertEquals(actual, 0);
	}

	@Test
	public void strStrTest4() {
		int actual = Problem0028ImplementStrStr.strStr(null, null);
		assertEquals(actual, 0);
	}

	@Test
	public void strStrTest5() {
		int actual = Problem0028ImplementStrStr.strStr(null, "");
		assertEquals(actual, 0);
	}

	@Test
	public void strStrTest6() {
		int actual = Problem0028ImplementStrStr.strStr("", null);
		assertEquals(actual, 0);
	}

	@Test
	public void strStrTest7() {
		int actual = Problem0028ImplementStrStr.strStr("helollo", "ll");
		assertEquals(actual, 4);
	}

	@Test
	public void strStrTest8() {
		int actual = Problem0028ImplementStrStr.strStr("aa", "aaa");
		assertEquals(actual, -1);
	}

	@Test
	public void strStrTest9() {
		int actual = Problem0028ImplementStrStr.strStr("mississippi", "issipi");
		assertEquals(actual, -1);
	}
}
