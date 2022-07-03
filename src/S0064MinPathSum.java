public class S0064MinPathSum {
	class Solution {
		public int minPathSum(int[][] grid) {
			int m = grid.length, n = grid[0].length;
			int[] prev = new int[n];
			prev[0] = grid[0][0];
			for (int i = 1; i < n; i++)
				prev[i] = prev[i - 1] + grid[0][i];
			int curr = prev[n - 1];
			for (int i = 1; i < m; i++) {
				curr = prev[0] + grid[i][0];
				prev[0] = curr;
				for (int j = 1; j < n; j++) {
					curr = Math.min(prev[j], curr) + grid[i][j];
					prev[j] = curr;
				}
			}
			return curr;
		}
	}
}
