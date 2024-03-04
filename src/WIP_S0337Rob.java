public class WIP_S0337Rob {
	class Solution {
		public int rob(TreeNode root) {
			if (root == null)
				return 0;
			if (root.left == null && root.right == null)
				return root.val;
			int left = root.left == null ? 0 : rob(root.left.left) + rob(root.left.right);
			int right = root.right == null ? 0 : rob(root.right.left) + rob(root.right.right);
			return Math.max(root.val + left + right, rob(root.left) + rob(root.right));

		}
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}