import java.util.List;

public class S0120MinimumTotal {
	class Solution {
		public int minimumTotal(List<List<Integer>> triangle) {
			int size = triangle.size();
			int[] arr = new int[size + 1];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.MAX_VALUE;
			arr[1] = triangle.get(0).get(0);
			for (int i = 1; i < size; i++) {
				Integer[] row = triangle.get(i).toArray(Integer[]::new);
				for (int j = row.length; j != 0; j--)
					arr[j] = Math.min(arr[j], arr[j - 1]) + row[j - 1];
			}
			int min = Integer.MAX_VALUE;
			for (int i = 1; i < arr.length; i++)
				min = min > arr[i] ? arr[i] : min;
			return min;
		}
	}
}
