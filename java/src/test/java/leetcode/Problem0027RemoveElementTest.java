package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0027RemoveElementTest {

	@Test
	public void removeElementTest() {
		int[] nums = { 1 };
		int actual = Problem0027RemoveElement.removeElement(nums, 0);
		assertEquals(actual, 1);
	}

	@Test
	public void removeElementTest2() {
		int[] nums = {};
		int actual = Problem0027RemoveElement.removeElement(nums, 0);
		assertEquals(actual, 0);
	}

	@Test
	public void removeElementTest3() {
		int[] nums = null;
		int actual = Problem0027RemoveElement.removeElement(nums, 0);
		assertEquals(actual, 0);
	}

	@Test
	public void removeElementTest4() {
		int[] nums = { 3, 2, 2, 3 };
		int actual = Problem0027RemoveElement.removeElement(nums, 3);
		assertEquals(actual, 2);
	}

	@Test
	public void removeElementTest5() {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int actual = Problem0027RemoveElement.removeElement(nums, 2);
		assertEquals(actual, 5);
	}

	@Test
	public void removeElementTest6() {
		int[] nums = { 3 };
		int actual = Problem0027RemoveElement.removeElement(nums, 3);
		assertEquals(actual, 0);
	}

}
