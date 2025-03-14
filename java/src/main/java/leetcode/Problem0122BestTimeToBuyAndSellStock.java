/**
 * 
 */
package leetcode;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 * 
 *         link:
 *         https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 */
public class Problem0122BestTimeToBuyAndSellStock {
	private static final Logger logger = LogManager.getLogger(Problem0122BestTimeToBuyAndSellStock.class);

	private Problem0122BestTimeToBuyAndSellStock() {

	}

	public static int maxProfit(int[] prices) {
		logger.info("Price list: {}", Arrays.asList(prices));

		if (prices == null || prices.length == 0)
			return 0;

		int max = prices[0];
		int min = prices[0];
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
				max = prices[i];
			} else if (prices[i] > max) {
				max = prices[i];
				profit += max - min;
				min = prices[i];
			}
		}

		return profit;
	}
}
