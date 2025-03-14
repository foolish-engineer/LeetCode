package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0070ClimbingStairsTest {

	@Test
	public void climbStairsTest1() {
		int actual = Problem0070ClimbingStairs.climbStairs(1);
		assertEquals(actual, 1);
	}

	@Test
	public void climbStairsTest2() {
		int actual = Problem0070ClimbingStairs.climbStairs(2);
		assertEquals(actual, 2);
	}

	@Test
	public void climbStairsTest3() {
		int actual = Problem0070ClimbingStairs.climbStairs(3);
		assertEquals(actual, 3);
	}

	@Test
	public void climbStairsTest4() {
		int actual = Problem0070ClimbingStairs.climbStairs(4);
		assertEquals(actual, 5);
	}

	@Test
	public void climbStairsTest5() {
		int actual = Problem0070ClimbingStairs.climbStairs(5);
		assertEquals(actual, 8);
	}

	@Test
	public void climbStairsTest6() {
		int actual = Problem0070ClimbingStairs.climbStairs(6);
		assertEquals(actual, 13);
	}
}
