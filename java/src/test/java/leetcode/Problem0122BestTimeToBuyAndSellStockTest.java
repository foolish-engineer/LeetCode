package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0122BestTimeToBuyAndSellStockTest {

	@Test
	public void maxProfitTest() {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int actual = Problem0122BestTimeToBuyAndSellStock.maxProfit(nums1);

		assertEquals(actual, 2);
	}

	@Test
	public void maxProfitTest2() {
		int[] nums1 = { 7, 1, 5, 3, 6, 4 };
		int actual = Problem0122BestTimeToBuyAndSellStock.maxProfit(nums1);

		assertEquals(actual, 7);
	}

	@Test
	public void maxProfitTest3() {
		int[] nums1 = { 7, 6, 4, 3, 1 };
		int actual = Problem0122BestTimeToBuyAndSellStock.maxProfit(nums1);

		assertEquals(actual, 0);
	}

	@Test
	public void maxProfitTest4() {
		int[] nums1 = { 1, 2 };
		int actual = Problem0122BestTimeToBuyAndSellStock.maxProfit(nums1);

		assertEquals(actual, 1);
	}

	@Test
	public void maxProfitTest5() {
		int[] nums1 = { 5, 9, 1, 2 };
		int actual = Problem0122BestTimeToBuyAndSellStock.maxProfit(nums1);

		assertEquals(actual, 5);
	}

	@Test
	public void maxProfitTest6() {
		int[] nums1 = { 5, 9, 1, 55 };
		int actual = Problem0122BestTimeToBuyAndSellStock.maxProfit(nums1);

		assertEquals(actual, 58);
	}

	@Test
	public void maxProfitTest7() {
		int[] nums1 = { 1, 2, 3, 4, 6, 9 };
		int actual = Problem0122BestTimeToBuyAndSellStock.maxProfit(nums1);

		assertEquals(actual, 8);
	}

}
