
public class S0045Jump {
	class Solution {
		public int jump(int[] nums) {
			int[] F = new int[nums.length];
			for (int i = 1; i < F.length; i++)
				F[i] = nums.length + 1;
			for (int i = 0; i < F.length; i++)
				for (int j = 1; j <= nums[i] && i + j < F.length; j++)
					F[i + j] = Math.min(F[i] + 1, F[i + j]);
			return F[F.length - 1];
		}
	}
}
