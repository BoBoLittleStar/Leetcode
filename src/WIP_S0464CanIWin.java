public class WIP_S0464CanIWin {
	class Solution {
		public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
			if (maxChoosableInteger >= desiredTotal)
				return true;
			boolean[] flags = new boolean[desiredTotal + 1];
			for (int i = 0; i < maxChoosableInteger; i++)
				flags[i] = true;
			for (int i = maxChoosableInteger; i <= desiredTotal; i++) {

			}
			return flags[desiredTotal];
		}
	}
}