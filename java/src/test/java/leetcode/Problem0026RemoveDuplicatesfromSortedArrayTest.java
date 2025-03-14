package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0026RemoveDuplicatesfromSortedArrayTest {

	@Test
	public void removeDuplicatesTest() {
		int[] nums = { 1 };
		int actual = Problem0026RemoveDuplicatesfromSortedArray.removeDuplicates(nums);
		assertEquals(actual, 1);
	}

	@Test
	public void removeDuplicatesTest2() {
		int[] nums = {};
		int actual = Problem0026RemoveDuplicatesfromSortedArray.removeDuplicates(nums);
		assertEquals(actual, 0);
	}

	@Test
	public void removeDuplicatesTest3() {
		int[] nums = { 1, 1, 2 };
		int actual = Problem0026RemoveDuplicatesfromSortedArray.removeDuplicates(nums);
		assertEquals(actual, 2);
	}

	@Test
	public void removeDuplicatesTest4() {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int actual = Problem0026RemoveDuplicatesfromSortedArray.removeDuplicates(nums);
		
		
		
		assertEquals(actual, 5);
	}
}
