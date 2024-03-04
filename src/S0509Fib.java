public class S0509Fib {
	class Solution {
		public int fib(int n) {
			if (n == 0)
				return 0;
			int a = 0, b = 1;
			for (int i = 2; i < n; i++) {
				int t = b;
				b += a;
				a = t;
			}
			return a + b;
		}
	}
}