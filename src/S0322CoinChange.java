import java.util.Arrays;

public class S0322CoinChange {
	class Solution {
		public int coinChange(int[] coins, int amount) {
			Arrays.sort(coins);
			if (amount == 0)
				return 0;
			int[] arr = new int[amount + 1];
			for (int i = 1; i <= amount; i++)
				arr[i] = Integer.MAX_VALUE;
			for (int i = 0; i < coins.length && coins[i] <= amount; i++)
				arr[coins[i]] = 1;
			for (int i = coins[0]; i <= amount; i++) {
				int min = arr[i - coins[0]];
				for (int j = 1; j < coins.length && coins[j] <= i; j++)
					if (min > arr[i - coins[j]])
						min = arr[i - coins[j]];
				if (min < Integer.MAX_VALUE) {
					min++;
					arr[i] = min;
				}
			}
			return arr[amount] == Integer.MAX_VALUE ? -1 : arr[amount];
		}
	}
}