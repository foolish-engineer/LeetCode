/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 *         link: https://leetcode.com/problems/min-stack/
 *
 */
public class Problem0155MinStack {

	/** initialize your data structure here. */

	int[] array = new int[8];
	int size = 0;
	int limit = 8;
	int min = 2147483647;

	public Problem0155MinStack() {
		super();
	}

	private void growArray(int size) {
		limit = size;
		int[] tempArray = new int[size];

		for (int i = 0; i < array.length; i++)
			tempArray[i] = array[i];

		array = tempArray;
	}

	public void push(int x) {
		if (size == limit)
			growArray(size * 2);

		array[size++] = x;

		if (x < min)
			min = x;
	}

	private void recalculateMin() {
		min = 2147483647;
		for (int i = 0; i < size; i++) {
			if (array[i] < min)
				min = array[i];
		}
	}

	public void pop() {
		array[--size] = 2147483647;
		recalculateMin();
	}

	public int top() {
		return array[size - 1];
	}

	public int getMin() {
		return min;
	}
}
