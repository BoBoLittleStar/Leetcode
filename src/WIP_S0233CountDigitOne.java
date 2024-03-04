public class WIP_S0233CountDigitOne {
	class Solution {
		public int countDigitOne(int n) {
			return helper(n);
		}

		private int helper(int n) {
			if (n == 0)
				return 0;
			int count = 0;
			while (n != 0) {
				if (n % 10 == 1)
					count++;
				n /= 10;
			}
			return helper(n - 1) + count;
		}
	}
}
