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
 *         link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 */
public class Problem0121BestTimeToBuyAndSellStock {
	private static final Logger logger = LogManager.getLogger(Problem0121BestTimeToBuyAndSellStock.class);

	private Problem0121BestTimeToBuyAndSellStock() {

	}

	public static int maxProfit(int[] prices) {
		logger.info("Price list: {}", Arrays.asList(prices));

		if (prices == null || prices.length == 0)
			return 0;

		int max = prices[0];
		int min = prices[0];
		boolean maxAheadMin = false;
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
				max = prices[i];
				maxAheadMin = false;
			} else if (prices[i] > max) {
				max = prices[i];
				maxAheadMin = true;
			}

			if (maxAheadMin && (max - min > profit))
				profit = max - min;
		}

		return profit;
	}
}
