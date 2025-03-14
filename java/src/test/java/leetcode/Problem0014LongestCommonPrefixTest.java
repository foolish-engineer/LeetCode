package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0014LongestCommonPrefixTest {

	@Test
	public void longestCommonPrefixTest() {
		String actual = Problem0014LongestCommonPrefix.longestCommonPrefix(new String[] { "flower", "flow", "flight" });

		assertEquals(actual, "fl");
	}

	@Test
	public void longestCommonPrefixTest2() {
		String actual = Problem0014LongestCommonPrefix.longestCommonPrefix(new String[] { "dog", "racecar", "car" });

		assertEquals(actual, "");
	}
}
