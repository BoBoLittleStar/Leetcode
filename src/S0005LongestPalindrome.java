public class S0005LongestPalindrome {
	class Solution {
		public String longestPalindrome(String s) {
			s = String.join("#", s.split(""));
			int[] res = helper(s.getBytes());
			s = s.substring(res[0], res[0] + res[1]);
			return String.join("", s.split("#"));
		}

		private int[] helper(byte[] cs) {
			int length = cs.length;
			int[] F = new int[length];
			boolean[] fail = new boolean[length];
			for (int i = 0; i < length; i++) {
				F[i] = 1;
				for (int j = 1; j < length; j++)
					if (!fail[i])
						if (i - j >= 0 && i + j < length && cs[i - j] == cs[i + j])
							F[i] += 2;
						else
							fail[i] = true;
			}
			for (int i = 0; i < length; i++)
				F[i] = (F[i] + 1) / 2;
			for (int i = 0; i < length; i++)
				if (F[i] % 2 == (cs[i] == '#' ? 1 : 0))
					F[i] -= 1;
			for (int i = 0; i < length; i++)
				F[i] = F[i] * 2 - 1;
			int[] res = new int[2];
			for (int i = 0; i < length; i++)
				if (F[i] > res[1])
					res[1] = F[res[0] = i];
			res[0] = res[0] - res[1] / 2;
			return res;
		}
	}
}