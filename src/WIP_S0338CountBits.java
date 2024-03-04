public class WIP_S0338CountBits {
	class Solution {
		public int[] countBits(int n) {
			int[] res = new int[n + 1];
			res[0] = 0;
			if (res.length > 1) {
				res[1] = 1;
				for (int i = 2; i <= n; i++)
					res[i] = res[i >> 1] + (i & 1);
			}
			return res;
		}
	}
}