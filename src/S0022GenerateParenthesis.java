import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class S0022GenerateParenthesis {
	class Solution {
		public List<String> generateParenthesis(int n) {
			List<List<String>> list = new ArrayList<>();
			list.add(List.of(""));
			list.add(List.of("()"));
			List<String> curr;
			for (int i = 2; i <= n; i++) {
				list.add(curr = new ArrayList<>());
				List<String> prev = list.get(i - 1);
				for (String s : prev)
					curr.add("(" + s + ")");
				for (int j = 1; j < i; j++) {
					List<String> left = list.get(j);
					List<String> right = list.get(i - j);
					for (String l : left)
						for (String r : right)
							curr.add(l + r);
				}
			}
			return new ArrayList<>(new HashSet<>(list.get(n)));
		}
	}
}