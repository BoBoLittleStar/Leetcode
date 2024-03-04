public class WIP_S0004FindMedianSortedArrays {
	class Solution {
		public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			int l1 = nums1.length, l2 = nums2.length;
			int skip = l1 + l2 - 1 >> 1;
			boolean isEven = (l1 + l2 & 1) == 0;
			int pos1 = nums1.length / 2, pos2 = nums2.length / 2;
			while (true) {
				int a = nums1[pos1];
				int b = nums2[pos2];
				if (a > b) {

				}
			}
		}
	}
}