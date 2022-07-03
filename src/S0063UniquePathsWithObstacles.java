public class S0063UniquePathsWithObstacles {
	class Solution {
		public int uniquePathsWithObstacles(int[][] obstacleGrid) {
			int m = obstacleGrid.length, n = obstacleGrid[0].length;
			if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
				return 0;
			int[] prev = new int[n];
			prev[0] = 1;
			int curr = 1;
			for (int i = 0; i < m; i++) {
				curr = obstacleGrid[i][0] == 1 ? 0 : prev[0];
				prev[0] = curr;
				for (int j = 1; j < n; j++) {
					curr = obstacleGrid[i][j] == 1 ? 0 : prev[j] + curr;
					prev[j] = curr;
				}
			}
			return curr;
		}
	}
}