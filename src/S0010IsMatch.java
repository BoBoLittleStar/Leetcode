public class S0010IsMatch {
	class Solution {
		public boolean isMatch(String s, String p) {
			return helper(s.getBytes(), p.getBytes(), 0, 0);
		}

		private boolean helper(byte[] bs, byte[] bp, int sp, int pp) {
			if (sp == bs.length && pp == bp.length)
				return true;
			if (sp < bs.length && pp < bp.length && (bs[sp] == bp[pp] || bp[pp] == '.'))
				return helper(bs, bp, sp + 1, pp + 1)
						|| pp < bp.length - 1 && bp[pp + 1] == '*' && helper(bs, bp, sp, pp + 2);
			if (pp < bp.length && bp[pp] == '*')
				return helper(bs, bp, sp, pp - 1) || helper(bs, bp, sp, pp + 1);
			if (pp < bp.length - 1 && bp[pp + 1] == '*')
				return helper(bs, bp, sp, pp + 2);
			return false;

		}
	}
}
