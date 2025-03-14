/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0204CountPrimes {

	public int countPrimes(int n) {
		int count = 0;

		for (int i = 2; i < n; i++) {
			if ((i > 2 && i % 2 == 0) || (i > 3 && i % 3 == 0) || (i > 5 && i % 5 == 0)) {
				continue;
			}
			count += isPrime(i);
		}

		return count;
	}

	public int isPrime(int n) {
		int prime = 1;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				prime = 0;
				break;
			}
		}

		return prime;
	}
}
