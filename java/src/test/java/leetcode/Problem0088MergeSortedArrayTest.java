package leetcode;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Problem0088MergeSortedArrayTest {

	@Test
	public void mergeTest() {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 4, 5, 6 };
		int m = 3;
		int n = 3;
		Problem0088MergeSortedArray.merge(nums1, m, nums2, n);

		assertEquals(Arrays.toString(nums1), "[1, 2, 3, 4, 5, 6]");
	}

	@Test
	public void mergeTest2() {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = {};
		int m = 3;
		int n = 0;
		Problem0088MergeSortedArray.merge(nums1, m, nums2, n);

		assertEquals(Arrays.toString(nums1), "[1, 2, 3]");
	}

	@Test
	public void mergeTest3() {
		int[] nums1 = { 4, 5, 6, 0, 0, 0 };
		int[] nums2 = { 1, 2, 3 };
		int m = 3;
		int n = 3;
		Problem0088MergeSortedArray.merge(nums1, m, nums2, n);

		assertEquals(Arrays.toString(nums1), "[1, 2, 3, 4, 5, 6]");
	}

	@Test
	public void mergeTest4() {
		int[] nums1 = { 2, 5, 6, 0, 0, 0 };
		int[] nums2 = { 1, 3, 4 };
		int m = 3;
		int n = 3;
		Problem0088MergeSortedArray.merge(nums1, m, nums2, n);

		assertEquals(Arrays.toString(nums1), "[1, 2, 3, 4, 5, 6]");
	}

	@Test
	public void mergeTest5() {
		int[] nums1 = { 2, 5, 0, 0, 0, 0 };
		int[] nums2 = { 1, 3, 4, 6 };
		int m = 2;
		int n = 4;
		Problem0088MergeSortedArray.merge(nums1, m, nums2, n);

		assertEquals(Arrays.toString(nums1), "[1, 2, 3, 4, 5, 6]");
	}

	@Test
	public void mergeTest6() {
		int[] nums1 = { 0, 0, 0, 0, 0, 0 };
		int[] nums2 = { 1, 2, 3, 4, 5, 6 };
		int m = 0;
		int n = 6;
		Problem0088MergeSortedArray.merge(nums1, m, nums2, n);

		assertEquals(Arrays.toString(nums1), "[1, 2, 3, 4, 5, 6]");
	}
}
