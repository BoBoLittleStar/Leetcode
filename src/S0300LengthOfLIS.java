public class S0300LengthOfLIS {
	class Solution {
		public int lengthOfLIS(int[] nums) {
			int n = nums.length, max = 0;
			int[] lens = new int[n];
			for (int i = 0; i < n; i++) {
				lens[i] = 1;
				for (int j = i - 1; j >= 0; j--)
					if (nums[j] < nums[i] && lens[i] <= lens[j])
						lens[i] = lens[j] + 1;
				if (max < lens[i])
					max = lens[i];
			}
			return max;
		}
	}
}
