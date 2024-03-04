public class WIP_S0407TrapRainWater {
	class Solution {
		public int trapRainWater(int[][] heightMap) {
			int m = heightMap.length, n = heightMap[0].length;
			int[][][] f = new int[m][n][4];
			for (int i = 0; i < m; i++) {
				f[i][0][0] = heightMap[i][0];
				f[i][n - 1][1] = heightMap[i][n - 1];
			}
			for (int j = 0; j < n; j++) {
				f[0][j][2] = heightMap[0][j];
				f[m - 1][j][3] = heightMap[m - 1][j];
			}
			for (int i = 0; i < m; i++)
				for (int j = 1; j < n; j++)
					f[i][j][0] = Math.max(f[i][j - 1][0], heightMap[i][j]);
			for (int i = 0; i < m; i++)
				for (int j = n - 2; j >= 0; j--)
					f[i][j][1] = Math.max(f[i][j + 1][1], heightMap[i][j]);
			for (int j = 0; j < n; j++)
				for (int i = 1; i < m; i++)
					f[i][j][2] = Math.max(f[i - 1][j][2], heightMap[i][j]);
			for (int j = 0; j < n; j++)
				for (int i = m - 2; i >= 0; i--)
					f[i][j][3] = Math.max(f[i + 1][j][3], heightMap[i][j]);
			int sum = 0;
			for (int i = 0; i < m; i++)
				for (int j = 0; j < n; j++)
					sum += Math.min(Math.min(Math.min(f[i][j][0], f[i][j][1]), f[i][j][2]), f[i][j][3])
							- heightMap[i][j];
			return sum;
		}
	}
}
