public class S0198Rob {
	class Solution {
		public int rob(int[] nums) {
			int len = nums.length;
			if (len == 1)
				return nums[0];
			nums[1] = nums[0] < nums[1] ? nums[1] : nums[0];
			for (int i = 2; i < len; i++)
				nums[i] = nums[i - 2] + nums[i] > nums[i - 1] ? nums[i - 2] + nums[i] : nums[i - 1];
			return nums[len - 1];
		}
	}
}
