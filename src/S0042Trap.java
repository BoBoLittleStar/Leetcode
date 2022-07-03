
public class S0042Trap {
	class Solution {
		public int trap(int[] height) {
			int l = height.length;
			int[][] f = new int[l][2];
			f[0][0] = height[0];
			f[l - 1][1] = height[l - 1];
			for (int i = 1; i < l; i++)
				f[i][0] = Math.max(f[i - 1][0], height[i]);
			for (int i = l - 2; i >= 0; i--)
				f[i][1] = Math.max(f[i + 1][1], height[i]);
			int[] r = new int[l];
			for (int i = 0; i < l; i++)
				r[i] = Math.min(f[i][0], f[i][1]) - height[i];
			int sum = 0;
			for (int i : r)
				sum += i;
			return sum;
		}
	}
}