package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0035SearchInsertPositionTest {

	@Test
	public void searchInsertTest() {
		int[] nums = { 1, 3, 5, 6 };
		int actual = Problem0035SearchInsertPosition.searchInsert(nums, 5);

		assertEquals(actual, 2);
	}

	@Test
	public void searchInsertTest2() {
		int[] nums = {};
		int actual = Problem0035SearchInsertPosition.searchInsert(nums, 5);

		assertEquals(actual, 0);
	}

	@Test
	public void searchInsertTest3() {
		int[] nums = { 1, 3, 5, 6 };
		int actual = Problem0035SearchInsertPosition.searchInsert(nums, 2);

		assertEquals(actual, 1);
	}

	@Test
	public void searchInsertTest4() {
		int[] nums = { 1, 3, 5, 6 };
		int actual = Problem0035SearchInsertPosition.searchInsert(nums, 7);

		assertEquals(actual, 4);
	}

	@Test
	public void searchInsertTest5() {
		int[] nums = { 1, 3, 5, 6 };
		int actual = Problem0035SearchInsertPosition.searchInsert(nums, 0);

		assertEquals(actual, 0);
	}
}
