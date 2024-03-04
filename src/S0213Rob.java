public class S0213Rob {
	class Solution {
		public int rob(int[] nums) {
			int len = nums.length;
			if (len == 1)
				return nums[0];
			int[] res = new int[len];
			res[0] = nums[0];
			res[1] = nums[0] < nums[1] ? nums[1] : nums[0];
			for (int i = 2; i < len - 1; i++)
				res[i] = res[i - 2] + nums[i] > res[i - 1] ? res[i - 2] + nums[i] : res[i - 1];
			int t = res[len - 2];
			res[0] = 0;
			res[1] = nums[1];
			for (int i = 2; i < len; i++)
				res[i] = res[i - 2] + nums[i] > res[i - 1] ? res[i - 2] + nums[i] : res[i - 1];
			return res[len - 1] < t ? t : res[len - 1];
		}
	}
}
