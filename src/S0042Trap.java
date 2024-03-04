public class S0042Trap {
	class Solution {
		public int trap(int[] height) {
			int l = height.length;
			if (l <= 2)
				return 0;
			int[] f1 = new int[l];
			int[] f2 = new int[l];
			f1[0] = height[0];
			f2[l - 1] = height[l - 1];
			for (int i = 1; i != l; i++)
				f1[i] = f1[i - 1] < height[i] ? height[i] : f1[i - 1];
			for (int i = l - 2; i != -1; i--)
				f2[i] = f2[i + 1] < height[i] ? height[i] : f2[i + 1];
			int sum = 0;
			for (int i = 0; i != l; i++)
				sum += (f1[i] < f2[i] ? f1[i] : f2[i]) - height[i];
			return sum;
		}
	}
}