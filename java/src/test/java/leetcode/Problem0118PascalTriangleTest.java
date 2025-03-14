package leetcode;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

public class Problem0118PascalTriangleTest {

	@Test
	public void generateTest() {
		List<List<Integer>> actual = Problem0118PascalTriangle.generate(0);
		assertEquals(actual.toString(), "[]");
	}

	@Test
	public void generateTest2() {
		List<List<Integer>> actual = Problem0118PascalTriangle.generate(1);
		assertEquals(actual.toString(), "[[1]]");
	}

	@Test
	public void generateTest3() {
		List<List<Integer>> actual = Problem0118PascalTriangle.generate(2);
		assertEquals(actual.toString(), "[[1], [1, 1]]");
	}

	@Test
	public void generateTest4() {
		List<List<Integer>> actual = Problem0118PascalTriangle.generate(3);
		assertEquals(actual.toString(), "[[1], [1, 1], [1, 2, 1]]");
	}

	@Test
	public void generateTest5() {
		List<List<Integer>> actual = Problem0118PascalTriangle.generate(4);
		assertEquals(actual.toString(), "[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]");
	}

	@Test
	public void generateTest6() {
		List<List<Integer>> actual = Problem0118PascalTriangle.generate(5);
		assertEquals(actual.toString(), "[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]");
	}
}
