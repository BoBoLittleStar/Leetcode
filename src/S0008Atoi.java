public class S0008Atoi {
	class Solution {
		public int myAtoi(String s) {
			byte[] bs = s.trim().getBytes();
			if (bs.length == 0)
				return 0;
			boolean neg = bs[0] == '-';
			int st = neg || bs[0] == '+' ? 1 : 0;
			long res = 0;
			for (int i = st; i < bs.length; i++) {
				if (bs[i] < '0' || bs[i] > '9')
					break;
				res *= 10;
				res += bs[i] - '0';
				if (!neg && res >= Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				else if (neg && res > Integer.MAX_VALUE)
					return Integer.MIN_VALUE;
			}
			return (int) (neg ? -res : res);
		}
	}
}