import java.util.ArrayList;
import java.util.List;

public class S0017LetterCombinations {
	class Solution {
		public List<String> letterCombinations(String digits) {
			if (digits.equals(""))
				return new ArrayList<>();
			byte[] bs = digits.getBytes();
			List<String> list = new ArrayList<>();
			list.add("");
			for (byte b : bs) {
				int p = b - '0' - 2, st = p * 3;
				if (p > 5)
					st++;
				int c = b == '7' || b == '9' ? 4 : 3;
				String[] strs = list.toArray(String[]::new);
				list.clear();
				for (String s : strs)
					for (int i = 0; i < c; i++)
						list.add(s + (char) (st + i + 'a'));
			}
			return list;
		}
	}
}
