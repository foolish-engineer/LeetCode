/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem1582SpecialPositionsinaBinaryMatrix {

	public int numSpecial(int[][] mat) {
		int[] rows = new int[mat.length];
		int[] columns = new int[mat[0].length];
		int special = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					rows[i]++;
					columns[j]++;
				}
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1 && rows[i] == 1 && columns[j] == 1) {
					special++;
				}
			}
		}

		return special;
	}
}
