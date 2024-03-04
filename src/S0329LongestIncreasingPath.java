public class S0329LongestIncreasingPath {
	class Solution {
		public int longestIncreasingPath(int[][] matrix) {
			int max = 0;
			int m = matrix.length, n = matrix[0].length;
			int[][] lens = new int[m][n];
			for (int i = 0; i < m; i++)
				for (int j = 0; j < n; j++) {
					if (lens[i][j] == 0)
						lens[i][j] = helper(m, n, matrix, lens, i, j);
					if (max < lens[i][j])
						max = lens[i][j];
				}
			return max;
		}

		private int helper(int m, int n, int[][] matrix, int[][] lens, int i, int j) {
			int max = 0;
			if (i > 0 && matrix[i - 1][j] > matrix[i][j]) {
				int t = lens[i - 1][j];
				if (t == 0)
					t = helper(m, n, matrix, lens, i - 1, j);
				max = max < t ? t : max;
			}
			if (i < m - 1 && matrix[i + 1][j] > matrix[i][j]) {
				int t = lens[i + 1][j];
				if (t == 0)
					t = helper(m, n, matrix, lens, i + 1, j);
				max = max < t ? t : max;
			}
			if (j > 0 && matrix[i][j - 1] > matrix[i][j]) {
				int t = lens[i][j - 1];
				if (t == 0)
					t = helper(m, n, matrix, lens, i, j - 1);
				max = max < t ? t : max;
			}
			if (j < n - 1 && matrix[i][j + 1] > matrix[i][j]) {
				int t = lens[i][j + 1];
				if (t == 0)
					t = helper(m, n, matrix, lens, i, j + 1);
				max = max < t ? t : max;
			}
			return lens[i][j] = max + 1;
		}
	}
}
