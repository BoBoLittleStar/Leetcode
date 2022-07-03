public class S0062UniquePaths {
	class Solution {
		public int uniquePaths(int m, int n) {
			long r = 1;
			for (int i = 1; i <= m - 1; i++) {
				r *= i + n - 1;
				r /= i;
			}
			return (int) r;
		}
	}
}